package com.atxiaojie.designmode.filterpattern.service.impl;

import com.atxiaojie.designmode.filterpattern.pojo.Person;
import com.atxiaojie.designmode.filterpattern.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CriteriaSingle
 * @Description: 创建实现了 Criteria 接口的实体类 单身的
 * @author: zhouxiaojie
 * @date: 2021/11/28 14:00
 * @Version: V1.0.0
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
