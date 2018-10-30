package Proxy;

import Entities.Star;

public class StarProxy2 extends Star {

    public StarProxy2(){
    }

    public void  play(String name){
        System.out.println("我是代理人2，我现在签合同..");
        super.act(name);
        System.out.println("我是代理人2，我现在结账.....");
    }
}
