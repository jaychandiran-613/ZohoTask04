import java.util.Scanner;

public class Reversestring {
    static Scanner p = new Scanner(System.in);

    public static String reverseConvertion(String input1)
    {
        char a;
        String str2 = "";
        for (int i=0; i<input1.length(); i++)
        {
            a = input1.charAt(i);
            str2 = a+str2;  
        }
        return str2;

    }
    public void reverseStr()
    {
        
        String input1;
        System.out.println("\n\nEnter the string to reverse : ");
        input1 = p.nextLine();
        input1 = reverseConvertion(input1);
        System.out.println("The reversed string : " + input1);
        
    }
    
}
