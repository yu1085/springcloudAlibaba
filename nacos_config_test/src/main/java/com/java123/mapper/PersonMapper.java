package com.java123.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java123.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author caihongyu
 * @since 2021-08-18
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}
