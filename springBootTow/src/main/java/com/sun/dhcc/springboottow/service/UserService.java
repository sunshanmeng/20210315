package com.sun.dhcc.springboottow.service;

import com.sun.dhcc.springboottow.dao.Ebuy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ssm
 * @date 2020/9/14 11:31
 */
@Service
public class UserService {
    @Autowired
    Ebuy ebuy;
    public void getUser(){
        List<Map<String,Object>> list = ebuy.user();
        System.out.println(list.toString());
    }
}
