package ex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ex4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx  = new ClassPathXmlApplicationContext("Zad4.xml");
        MessageSender emailSender = ctx.getBean("emailSender" ,MessageSender.class);
        MessageSender smsSender = ctx.getBean("smsSender" ,MessageSender.class);
        emailSender.sendMessage();
        smsSender.sendMessage();
        ctx.close();
    }
}
