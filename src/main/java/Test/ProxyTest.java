package Test;

import Entities.*;
import Interfaces.IAct;
import Interfaces.ISing;
import Proxy.ActiveStarProxy;

public class ProxyTest {
    public static void main(String[] args) {


        //第一第二种方式
//        System.out.println("=====接口代理=====");
//        IAct iAct=new StarProxy();
//        iAct.act("one1");
//
//        System.out.println("=====继承代理=====");
//        StarProxy2 starProxy2=new StarProxy2();
//        starProxy2.play("one2");

        System.out.println("=====动态代理=====");
        IAct iAct1= (IAct) new ActiveStarProxy().getObject(new Star());
        iAct1.act("one3");

        IAct iAct2= (IAct) new ActiveStarProxy().getObject(new Star());
        iAct2.act("one4");

        ISing iSing= (ISing) new ActiveStarProxy().getObject(new SingStar());
        iSing.sing("丽丽");

    }
}
