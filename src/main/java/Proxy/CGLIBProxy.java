package Proxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBProxy implements MethodInterceptor {

    //被处理的对象
    Object targetobjec;

    //获得被处理的对象
    public Object getTargetobjec(Object targetobjec){
        this.targetobjec=targetobjec;
        //增强器，动态代码生成器
        Enhancer enhancer=new Enhancer();
        //回调方法
        enhancer.setCallback(this);
        //设置生成类的父类类型
        enhancer.setSuperclass(targetobjec.getClass());
        //动态生成字节码并返回代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //植入的方法1
        System.out.println("=====start=====");
        Object result=methodProxy.invoke(targetobjec,objects);
        //植入的方法2
        System.out.println("=====end=====");
        return result;
    }
}
