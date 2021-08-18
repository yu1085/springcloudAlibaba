package com.java123.controller;


import com.java123.entity.Person;
import com.java123.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caihongyu
 * @since 2021-08-18
 */
@RestController
@RequestMapping("/dcp/person")
public class PersonController {

    @Autowired
    IPersonService iPersonService;

    @RequestMapping("/getAll")
    public List<Person> getAll(){
        return iPersonService.getAll();
    }

}
