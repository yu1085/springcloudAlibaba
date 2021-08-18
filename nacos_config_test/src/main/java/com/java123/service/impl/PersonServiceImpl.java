package com.java123.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java123.entity.Person;
import com.java123.mapper.PersonMapper;
import com.java123.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caihongyu
 * @since 2021-08-18
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public List<Person> getAll() {
        List<Person> people = personMapper.selectList(null);
        return people;
    }
}
