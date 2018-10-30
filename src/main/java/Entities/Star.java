package Entities;

import Interfaces.IAct;
import Interfaces.IPlayandDance;

public class Star implements IAct , IPlayandDance {

    @Override
    public void act(String name) {
        System.out.println("我是明星"+name+"，我会演戏!");
    }

    public void play(String name){
        System.out.println("我是明星"+name+",我还会玩乐器!");
    }

    public void dance(String name){
        System.out.println("我是明星"+name+",我还会跳舞!");
    }
}
