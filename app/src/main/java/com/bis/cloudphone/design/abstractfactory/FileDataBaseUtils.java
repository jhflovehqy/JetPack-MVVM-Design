package com.bis.cloudphone.design.abstractfactory;

public class FileDataBaseUtils implements IDataBaseUtils{
    @Override
    public IConnect getConnection() {
        return new FileConnection();
    }

    @Override
    public ICommand getCommand() {
        return new FileCommand();
    }
}
