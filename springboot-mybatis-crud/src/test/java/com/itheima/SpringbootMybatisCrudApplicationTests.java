package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@Autowired
//private UserMapper userMapper;
//
//@Test
//public void testListUser() {
//    List<User> userList = userMapper.list();
//    userList.stream().forEach(user -> {
//        System.out.println(user);
//    });
//}

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testSelectEmpById() {
        Emp empList = empMapper.list(1);
        System.out.println(empList);

    }


}
