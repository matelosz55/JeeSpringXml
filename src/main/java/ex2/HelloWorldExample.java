package ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        ctx.getBean("zad2HelloWorld",HelloWorld.class);
        System.out.println(HelloWorld.getMessage());
    }
}
