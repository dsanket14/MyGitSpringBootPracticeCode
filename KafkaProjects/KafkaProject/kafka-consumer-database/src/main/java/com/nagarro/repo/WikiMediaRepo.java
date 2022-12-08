package com.nagarro.repo;

import com.nagarro.model.WilkiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiMediaRepo extends JpaRepository<WilkiMediaData,Long> {
}
