package com.tianruoxi.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Tianruoxi
 * @Date: 2021/1/31 12:24
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @TableId(type = IdType.ASSIGN_UUID)
    private int id;
    private String name;
    private String author;
    private String publish;
    private int pages;
    private float price;

}
