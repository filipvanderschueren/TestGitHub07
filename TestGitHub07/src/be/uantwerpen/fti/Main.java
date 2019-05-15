package be.uantwerpen.fti;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello............");

        Message m = new Message();
        m.setMessage( "a new Message from Filip" );
        System.out.println("Message............" + m.getMessage());

        Value v = new Value();
        v.setValue( 44 );
        System.out.println("Value............" + v.getValue());

    }
}
