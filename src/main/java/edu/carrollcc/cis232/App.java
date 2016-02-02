package edu.carrollcc.cis232;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print ("Enter name: ");
    	String name = scan.nextLine();
    	System.out.println();
        System.out.printf("Hello %s!%n", name);
        scan.close();
    }
}
