package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ActiveStarProxy implements InvocationHandler {

    /*需要代理的对象*/
    Object object;

    /*获得被代理的对象*/
    public Object getObject(Object object){
        this.object=object;
        //通过动态代理类返回一个新的实例，在当前类执行
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //被织入的横切内容1
        System.out.println("我是动态代理3，我在签合同");
        Object result=method.invoke(object,args);
        //被织入的横切内容2
        System.out.println("我是动态代理3，我在收款");
        return result;
    }
}
