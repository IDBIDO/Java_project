package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpMapper {
    @Select("select * from emp where id = #{id}")
    public Emp list(Integer id);

}
