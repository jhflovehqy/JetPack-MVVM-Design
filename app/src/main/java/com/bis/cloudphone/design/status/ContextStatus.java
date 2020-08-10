package com.bis.cloudphone.design.status;

public class ContextStatus {

    private Status status;

    public ContextStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void handler(){
        status.exec(this);
    }
}
