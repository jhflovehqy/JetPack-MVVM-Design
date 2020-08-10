package com.bis.cloudphone.design.responsibility;

public abstract class Handler {

    public Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
    protected abstract boolean handlerRequest(Request isNext);
}
