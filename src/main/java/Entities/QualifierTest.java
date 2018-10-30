package Entities;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class QualifierTest {

    @Autowired
    @Qualifier("daoA")
    IBookDao dao;

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("bookbean13.xml");
        //QualifierTest obj = ctx.getBean(QualifierTest.class);
        QualifierTest iBookDao= (QualifierTest) ctx.getBean(QualifierTest.class);
        System.out.println(iBookDao.dao);
    }
}


