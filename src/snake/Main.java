package snake;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        try {
            System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
