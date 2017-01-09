package com.tutorialspoint;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by shashank on 27/3/16.
 */
public class MainApp {
    public static void main(String[] args){
/*        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obj  = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage1();
        obj.getMessage2();

        HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
        obj2.getMessage1();
        obj2.getMessage2();
        obj2.getMessage3();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        // TextEditor te = (TextEditor) context.getBean("textEditor");
        // te.spellCheck();
//      JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
//            jc.getAddressList();
//            jc.getAddressMap();
//            jc.getAddressProp();
//            jc.getAddressMap();

    }
}