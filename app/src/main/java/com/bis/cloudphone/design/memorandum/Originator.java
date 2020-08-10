package com.bis.cloudphone.design.memorandum;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/10 14:29
 * 说明： 备忘录模式 - 负责创建一个备忘录
 */
public class Originator {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento createMemento(){
        return new Memento(status);
    }

    public void restoreMemento(Memento memento){
        this.setStatus(memento.getStatus());
    }
}
