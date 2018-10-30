package Test;

import Entities.SingStar;
import Interfaces.ISing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class testaop2 {

    @Resource(name = "singstar")
    ISing sing;

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansOfAOP2.xml");
        testaop2 testaop2= applicationContext.getBean(testaop2.class);
        testaop2.sing.sing("mike");
    }
}
