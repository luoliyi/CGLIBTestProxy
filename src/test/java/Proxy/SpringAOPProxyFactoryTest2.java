package Proxy;

import Aop.BeforeAdvice;
import Aop.SurroundAdvice;
import Entities.Star;
import Interfaces.IPlayandDance;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class SpringAOPProxyFactoryTest2 {
    //实例化Spring代理工厂
    ProxyFactory proxyFactory=new ProxyFactory();

    @Test
    public void testproxyfactory(){
        proxyFactory.addAdvice(new BeforeAdvice());
        proxyFactory.addAdvice(new SurroundAdvice());
        proxyFactory.setTarget(new Star());

        IPlayandDance iPlayandDance= (IPlayandDance) proxyFactory.getProxy();
        iPlayandDance.dance("213");
        iPlayandDance.play("123");
    }
}