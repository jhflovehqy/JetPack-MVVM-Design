package com.bis.cloudphone.design.abstractfactory;

import com.bis.cloudphone.utils.system.Logger;

public class DataBaseConnection implements IConnect{
    @Override
    public void connectDataBase() {
        Logger.d("连接sqlite数据库 == connect");
    }
}
