package Proxy;

import Aop.AfterAdvice;
import Aop.BeforeAdvice;
import Aop.SurroundAdvice;
import Entities.SingStar;
import Interfaces.ISing;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

import static org.junit.Assert.*;

public class SpringAOPProxyFactoryTest {
    //实例化Spring代理工厂
    ProxyFactory proxyFactory=new ProxyFactory();

    @Test
    public void testproxyfactory(){
        proxyFactory.addAdvice(new BeforeAdvice());
        proxyFactory.addAdvice(new SurroundAdvice());
        proxyFactory.addAdvice(new AfterAdvice());
        proxyFactory.setTarget(new SingStar());
        ISing sing= (ISing) proxyFactory.getProxy();
        sing.sing("dhauwhdu");
    }
}