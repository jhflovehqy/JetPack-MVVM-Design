package com.bis.cloudphone.design.proxy;

import android.annotation.SuppressLint;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;

import retrofit2.http.GET;
/**
 * 作者： 江海锋
 * 添加时间： 2020/8/7 10:21
 * 说明： 代理模式
 * 代理模式分静态代理和动态代理
 * --------
 * 官方说法：
 * 由于某些原因需要给某对象提供一个代理以控制对该对象的访问。
 * 这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 * --------
 * 使用优点
 * &1 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
 * &2 代理对象可以扩展目标对象的功能；
 * &3 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度；
 *
 * --------
 * 运用场景
 * 静态代理运用在不想直接调用 ， 并且需要代理的对象比较少的时候
 * 动态代理运用在代理对象比较多的时候
 * --------
 * 动态代理业务理解
 * 静态代理每增加一个业务 ， 需要添加一个业务实现类和代理类
 * 动态代理只需要增加一个业务类即可 ， 不需要代理类
 *
 */
public class Control {


    public static void main(String[] args) {


        //静态代理
//        RealSubject realSubject1 = new RealSubject();
//        StaticProxy staticProxy1 = new StaticProxy(realSubject1);
//        staticProxy1.doSomething();


        //动态代理
        RealSubject realSubject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
//        ISubject proxyInstance = (ISubject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader() ,
//                new Class[]{ISubject.class} , dynamicProxy);

//        proxyInstance.doSomething();
        ISubject iSubject = (ISubject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                new InvocationHandler() {
                    @SuppressLint("NewApi")
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("开始进行动态代理。。");
                        System.out.println("动态代理类名：" + realSubject.getClass().getName());
                        System.out.println("动态代理子类名：" + realSubject.getClass().getSimpleName());
                        System.out.println("动态代理接口：" + realSubject.getClass().getInterfaces().toString());
                        System.out.println("调用方法名：" + method.getName());
                        Annotation[] annotations = method.getAnnotations();
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        System.out.println("调用类型大小：" + genericParameterTypes.length + parameterAnnotations.length);
                        for (int i = 0; i < genericParameterTypes.length; i++) {
                            System.out.println("返回类型：" + (genericParameterTypes[i].getTypeName()));
                        }

                        System.out.println("调用对象大小：" + annotations.length);
                        for (int i = 0; i < annotations.length; i++) {
                            System.out.println("调用对象：" + ((GET) annotations[i]).value());
                        }
//                        System.out.println("调用参数：" + objects.toString());


                        Object object = method.invoke(realSubject, objects);
                        System.out.println("开始进行动态代理。。");
                        return object;
                    }
                });
        iSubject.doSomething();

        TaskSubject taskSubject = new TaskSubject();
        ISubject iSubject1 = (ISubject) Proxy.newProxyInstance(taskSubject.getClass().getClassLoader(),
                taskSubject.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("他也要执行任务了，怎么办");
                        Object o1 = method.invoke(taskSubject, objects);
                        System.out.println("没事，不要慌！");
                        return o1;
                    }
                });
        iSubject1.doSomething();
    }
}
