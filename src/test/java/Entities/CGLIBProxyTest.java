package Entities;

import Interfaces.IAct;
import Interfaces.ISing;
import Proxy.CGLIBProxy;
import org.junit.Before;
import org.junit.Test;

public class CGLIBProxyTest {

    //面向接口
    ISing sing;
    IAct iAct;

    //实例
    Star star;

    @Before
    public void setUp() throws Exception {
        sing= (ISing) new CGLIBProxy().getTargetobjec(new SingStar());

        //1、java自带动态代理
        //iAct= (IAct) new ActiveStarProxy().getObject(new Star());
        //2、使用cglib插件
        iAct= (IAct) new CGLIBProxy().getTargetobjec(new Star());

        star= (Star) new CGLIBProxy().getTargetobjec(new Star());
    }

    @Test
    public void test(){
        sing.sing("mike");
        iAct.act("jack");

        star.act("julia ");
    }
}