package pl.coderslab.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hw = ctx.getBean("myHelloWorld", HelloWorld.class);
        HelloWorld davidHello = ctx.getBean("davidHello", HelloWorld.class);
        hw.sayHi();
        hw.greet();
        hw.otherGreet("Karolina");
        davidHello.otherGreet("Mati");
        davidHello.greet();
        ctx.close();
    }
}
