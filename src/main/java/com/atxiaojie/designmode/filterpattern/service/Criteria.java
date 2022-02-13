package com.atxiaojie.designmode.filterpattern.service;

import com.atxiaojie.designmode.filterpattern.pojo.Person;

import java.util.List;

/**
 * @ClassName: Criteria
 * @Description: 人物类
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:53
 * @Version: V1.0.0
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
