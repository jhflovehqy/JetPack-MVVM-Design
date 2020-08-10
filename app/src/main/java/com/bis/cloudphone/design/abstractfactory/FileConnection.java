package com.bis.cloudphone.design.abstractfactory;

import com.bis.cloudphone.utils.system.Logger;

public class FileConnection implements IConnect{
    @Override
    public void connectDataBase() {
        Logger.d("连接文件系统 == connect");
    }

}
