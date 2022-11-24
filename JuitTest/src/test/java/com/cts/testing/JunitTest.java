package com.cts.testing;

import com.cts.sample.MyMethod;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.*;
import org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTest {


    @Autowired
    MyMethod myMethod;

    @Test
    public void testmymethod() {
        //int actual= myMethod.sum(10,20);
        //int expected=60;
        assertEquals(70, myMethod.sum(10, 10));

    }
}