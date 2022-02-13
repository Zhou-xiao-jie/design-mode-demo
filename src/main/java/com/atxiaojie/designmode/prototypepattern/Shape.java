package com.atxiaojie.designmode.prototypepattern;

/**
 * @ClassName: Shape
 * @Description: 创建一个实现了 Cloneable 接口的抽象类Shape
 * @author: zhouxiaojie
 * @date: 2021/11/28 10:29
 * @Version: V1.0.0
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
