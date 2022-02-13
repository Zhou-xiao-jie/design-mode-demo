package com.atxiaojie.designmode.filterpattern.service.impl;

import com.atxiaojie.designmode.filterpattern.pojo.Person;
import com.atxiaojie.designmode.filterpattern.service.Criteria;

import java.util.List;

/**
 * @ClassName: AndCriteria
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/11/28 14:01
 * @Version: V1.0.0
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
