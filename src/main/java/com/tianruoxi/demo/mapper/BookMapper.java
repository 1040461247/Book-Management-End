package com.tianruoxi.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tianruoxi.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Tianruoxi
 * @Date: 2021/1/31 12:23
 */

@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
