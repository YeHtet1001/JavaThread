public class Main {

    public static void main(String[] args) {

        MyClass thread1 = new MyClass("Thread1");
        MyClass thread2 = new MyClass("Thread2");
        MyClass thread3 = new MyClass("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}