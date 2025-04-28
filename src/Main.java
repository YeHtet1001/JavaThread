public class Main {

    public static void main(String[] args) {

        MyClass thread1 = new MyClass("Thread1");
        MyClass thread2 = new MyClass("Thread2");
        MyClass thread3 = new MyClass("Thread3");

//        thread1.start();
//        thread2.start();
//        thread3.start();

        System.out.println( "thread1 " + thread1.isAlive() );
        System.out.println( "thread2 " + thread2.isAlive() );
        System.out.println( "thread3 " + thread3.isAlive() );

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println( "thread1 " + thread1.isAlive() );
        System.out.println( "thread2 " + thread2.isAlive() );
        System.out.println( "thread3 " + thread3.isAlive() );

    }

}