package com.atxiaojie.designmode.filterpattern.pojo;

/**
 * @ClassName: Person
 * @Description: 人物类
 * @author: zhouxiaojie
 * @date: 2021/11/28 13:53
 * @Version: V1.0.0
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
