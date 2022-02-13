package com.atxiaojie.designmode.filterpattern.service.impl;

import com.atxiaojie.designmode.filterpattern.pojo.Person;
import com.atxiaojie.designmode.filterpattern.service.Criteria;

import java.util.List;

/**
 * @ClassName: OrCriteria
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/11/28 14:02
 * @Version: V1.0.0
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
