package com.bis.cloudphone.design.command;

public class Invoker {


    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }


    public void command(){
        System.out.println("执行command方法==");
        command.call();
    }

}
