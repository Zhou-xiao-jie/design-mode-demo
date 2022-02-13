package com.atxiaojie.designmode.filterpattern.service.impl;

import com.atxiaojie.designmode.filterpattern.pojo.Person;
import com.atxiaojie.designmode.filterpattern.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CriteriaFemale
 * @Description: 创建实现了 Criteria 接口的实体类 女性
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:58
 * @Version: V1.0.0
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
