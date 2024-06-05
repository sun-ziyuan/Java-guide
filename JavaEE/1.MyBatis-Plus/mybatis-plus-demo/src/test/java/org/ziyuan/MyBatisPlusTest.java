package org.ziyuan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.ziyuan.pojo.User;
import org.ziyuan.mapper.UserMapper;
import org.ziyuan.service.UserService;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBatisPlusTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void testSelectList(){
        // 通过条件构造器查询一个list集合,若没有条件,则可以设置null为参数
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

        // service实现
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }

}