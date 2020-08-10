package com.bis.cloudphone.design.abstractfactory;

import com.bis.cloudphone.utils.system.Logger;

public class DataBaseCommand implements ICommand{
    @Override
    public void command() {
        Logger.d("连接sqlite数据库 == command");
    }
}
