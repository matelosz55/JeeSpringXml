package pl.coderslab.spring;

public class HelloWorld {
    public void sayHi(){
        System.out.println("Hi there");
    }

    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello " + name);
    }
    public void otherGreet(String otherName){
        System.out.println("Hello " + otherName);
    }
}
