import java.util.Scanner;
public class Wrapping {

    public static void main(String[] args) {

        Float floatobj;

        Scanner s = new Scanner(System.in);
        
        System.out.println("enter the float number : ");
        float number = s.nextFloat();

        floatobj = number; 
        int val = floatobj.intValue();
        
        System.out.println("int value " + val);
        s.close();

	}
    
}
