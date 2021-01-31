package com.tianruoxi.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tianruoxi.demo.entity.Book;
import com.tianruoxi.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tianruoxi
 * @Date: 2021/1/31 12:34
 */

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookMapper bookMapper;

    @GetMapping("/findAll")
    public List<Book> findAll() {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        return bookMapper.selectList(wrapper);
    }

    @GetMapping("/pageQuery/{page}/{size}")
    public Map pageQuery(@PathVariable("page") int page,
                         @PathVariable("size") int size) {

        IPage<Book> bookPage = new Page<>(page, size);
        bookPage = bookMapper.selectPage(bookPage, null);
        List<Book> list = bookPage.getRecords();

        Long total = bookPage.getTotal();

        HashMap<Object, Object> map = new HashMap<>();
        map.put("content", list);
        map.put("total", total);

        return map;
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book) {
        int res = bookMapper.insert(book);
        if (res != 0) {
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable("id") int id) {
        Book book = bookMapper.selectById(id);
        if(book != null) {
            return book;
        } else {
            return "File ID not exist";
        }
    }

    @PutMapping("/editBook")
    public String editBook(@RequestBody Book book) {
        int i = bookMapper.updateById(book);
        if(i == 1) {
            return "success";
        } else {
            return "error";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        int i = bookMapper.deleteById(id);
        if(i == 1) {
            return "success";
        } else {
            return "error";
        }
    }

}
