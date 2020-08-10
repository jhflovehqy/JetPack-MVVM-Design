package com.bis.cloudphone.design.abstractfactory;

public interface IDataBaseUtils {

    IConnect getConnection();
    ICommand getCommand();
}
