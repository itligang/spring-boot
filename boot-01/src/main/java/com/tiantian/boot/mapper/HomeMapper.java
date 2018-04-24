package com.tiantian.boot.mapper;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("homeMapper")
public interface HomeMapper {

    @Select("select  u.password from sys_user u where u.username ='admin'")
    public String querydata();
}
