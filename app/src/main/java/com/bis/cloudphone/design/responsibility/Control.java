package com.bis.cloudphone.design.responsibility;

/**
 * 作者： 江海锋
 * 添加时间： 2020/8/3 13:32
 * 说明： 责任链模式
 */
public class Control {


    public static void main(String[] args) {
        Request build = new Request.Builder()
                .setFrequency(true)
                .setLogged(true)
                .build();
        Handler handler = new DetectionFrequencyHandler(new DetectionLoginHandler(null));
        handler.handlerRequest(build);
    }


}
