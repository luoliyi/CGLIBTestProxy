package Proxy;

import Entities.Star;
import Interfaces.IAct;

public class StarProxy implements IAct {

    //需要被代理的细节
    IAct iActobj;
//    public StarProxy(Star star){
//        this.iActobj=star;
//    }
    public StarProxy(){
        this.iActobj=new Star();
    }

    @Override
    public void act(String name) {
        System.out.println("我是明星代理人，我现在签约...");
        iActobj.act(name);
        System.out.println("我是明星代理人，我现在结算...");
    }
}
