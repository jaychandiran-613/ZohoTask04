import java.util.Scanner;
public class Comparestring {
    static Scanner s = new Scanner(System.in);
    public static boolean checkstring(String str1, String str2)
    {
        return str1.equalsIgnoreCase(str2);
    }

    public void comString()
    {
        String str1 = "",str2 = "";
        boolean check;
        
        System.out.println("\n\nEnter the string 1 to compare : ");
        str1 = s.nextLine();
        System.out.println("Enter the string 2 to compare : ");
        str2 = s.nextLine(); 
        check = checkstring(str1, str2);
        if(check == true)
        {
            System.out.println("The string are equal without case sensitive.");
        }
        else
        {
            System.out.println("The string are not equal even without case sensitive. ");
        }

    }
    
}
