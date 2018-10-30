package Test;

import Aop.AfterAdvice;
import Aop.BeforeAdvice;
import Aop.SurroundAdvice;
import Entities.SingStar;
import Interfaces.ISing;
import Proxy.CGLIBProxy;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testaop {
    public static void main(String[] args) {
        //CGLIB动态代理方法测试 第一种
        ISing sing= (ISing) new CGLIBProxy().getTargetobjec(new SingStar());
        sing.sing("cglibsingstar");

        //代理工厂方法测试 第二种
        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(new SingStar());
        proxyFactory.addAdvice(new BeforeAdvice());
        proxyFactory.addAdvice(new SurroundAdvice());
        proxyFactory.addAdvice(new AfterAdvice());
        ISing iSing= (ISing) proxyFactory.getProxy();
        iSing.sing("Mike");

        //代理.xml方法测试 第三种
        //容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        ISing sing2= (ISing) applicationContext.getBean("proxy2");
        sing2.sing("beansing");

        //第四种
        System.out.println("第四种在下面...");
        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("beansOfAOP.xml");
        ISing iSing1= (ISing) applicationContext1.getBean("SingStar");
        iSing1.sing("beansOfAOPing");
    }
}
