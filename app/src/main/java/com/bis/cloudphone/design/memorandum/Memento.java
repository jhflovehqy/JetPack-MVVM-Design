package com.bis.cloudphone.design.memorandum;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/10 14:29
 * 说明： 备忘录模式 - 备忘录角色，用于存储Originator的内部状态
 */
public class Memento {

    private String status;

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
