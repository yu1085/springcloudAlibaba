package com.java123.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.java123.entity.Person;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caihongyu
 * @since 2021-08-18
 */
public interface IPersonService extends IService<Person> {

    List<Person> getAll();
}
