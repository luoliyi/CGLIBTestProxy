package Entities;

import Interfaces.ISing;
import org.springframework.stereotype.Repository;

@Repository("singstar")
public class SingStar implements ISing {

    public SingStar(){}

    @Readme("注解，我是唱歌的方法。")
    public void sing(String name) {
            System.out.println("我是明星"+name+"，我会唱歌!");
    }

}
