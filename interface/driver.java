public class driver implements Example,Example2 {
    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String something) {
        System.out.println(something);
    }

    public void sayGoodbye() {
        System.out.println("Good Bye");
    }

    public static void main(String[] args) {
        driver d= new driver();
        d.sayHello();
        d.saySomething("Something");
        d.sayGoodbye();
    }
}