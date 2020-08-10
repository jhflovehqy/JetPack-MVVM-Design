package com.bis.cloudphone.design.abstractfactory;

public class SqlitDataBaseUtils implements IDataBaseUtils{

    @Override
    public IConnect getConnection() {
        return new DataBaseConnection();
    }

    @Override
    public ICommand getCommand() {
        return new DataBaseCommand();
    }
}
