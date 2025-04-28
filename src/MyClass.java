public class MyClass extends Thread{

    public MyClass( String name ){

        super(name) ;

    }

    public void run(){

        for(int i = 0 ; i < 10 ; i++){

            System.out.println( i + "::" + this.getName() );
            try {

                Thread.sleep(5000);

            } catch (InterruptedException e) {

                throw new RuntimeException(e);
                
            }

        }

    }

}
