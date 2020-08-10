package com.bis.cloudphone.design.memorandum;
/**
 * 作者： 江海锋
 * 添加时间： 2020/8/10 14:30
 * 说明： 备忘录模式 - 负责存储备忘录，不能对备忘录的内容进行操作和访问
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
