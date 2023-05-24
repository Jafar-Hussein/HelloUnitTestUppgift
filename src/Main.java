import hello.Hello;
public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.sayHello("Alice"));
        System.out.println(hello.sayHello("Bob"));
        System.out.println(hello.sayHello("Carol"));
    }
}