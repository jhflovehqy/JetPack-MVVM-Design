package com.bis.cloudphone.design.proxy;

import androidx.annotation.NonNull;
import retrofit2.http.GET;
/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 10:13
 * 说明： 抽象接口，子类实现
 */
public interface ISubject {

    @NonNull
    @GET("啦啦啦")
    String doSomething();
}
