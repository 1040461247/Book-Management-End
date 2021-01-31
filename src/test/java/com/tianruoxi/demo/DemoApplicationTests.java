package com.tianruoxi.demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tianruoxi.demo.entity.Book;
import com.tianruoxi.demo.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {
        IPage<Book> userPage = new Page<>(2, 2);//参数一是当前页，参数二是每页个数
        userPage = bookMapper.selectPage(userPage, null);
        List<Book> list = userPage.getRecords();
        for(Book user : list){
            System.out.println(user);
        }
    }

}
