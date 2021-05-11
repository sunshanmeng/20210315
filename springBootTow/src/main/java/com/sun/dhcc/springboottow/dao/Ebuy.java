package com.sun.dhcc.springboottow.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author ssm
 * @date 2020/9/14 11:27
 */
@Mapper
@Component
public interface Ebuy {
    List<Map<String,Object>> user();
}
