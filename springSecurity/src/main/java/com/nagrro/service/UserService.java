package com.nagrro.service;

import com.nagrro.entity.User;
import com.nagrro.exception.DataNotFounDException;
import com.nagrro.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {


    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveAllUser(List<User> userList){
        return repository.saveAll(userList);
    }

    public List<User> getAllUser(){
        return repository.findAll();
    }

    public Optional<User> getByUserName(Long id){
        return repository.findById(id);
    }

    public String deleteByID(Long id){
         repository.deleteById(id);
         return "Records Deleted for userName: "+id;
    }

    public User updateUser(User user,Long id) throws DataNotFounDException {
        User user1=repository.findById(id).orElseThrow(()->new DataNotFounDException("No Data Found for "+id));
        user1.setUserMb(user.getUserMb());
        user1.setUserEmailId(user.getUserEmailId());
        user1.setUserPassword(user.getUserPassword());

        return user1;
    }
}
