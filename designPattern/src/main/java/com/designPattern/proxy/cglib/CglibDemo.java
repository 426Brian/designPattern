package com.designPattern.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * Classname: CglibDemo
 * Pacage: com.designPattern.proxy.cglib
 * Discription:
 *
 * @Author: Brian
 * @Create: 2024/06/29-16:11
 * Version: v1.0
 */
public class CglibDemo {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Handler.class);
        enhancer.setCallback((MethodInterceptor) (target, method, param, methdProxy) -> {
            System.out.println("enhancer callback  -----> method before");
            Object result = methdProxy.invokeSuper(target, param);
            System.out.println("enhancer callback  -----> method after");
            return result;
        });
        var proxyObj = (Handler) enhancer.create();
        proxyObj.handle();
    }

}

class Handler {
    public String handle() {
        return "Handler#handle()--------->";
    }
}