package com.bis.cloudphone.design.abstractfactory;

import com.bis.cloudphone.utils.system.Logger;

public class FileCommand implements ICommand {
    @Override
    public void command() {
        Logger.d("连接文件系统 == command");
    }
}
