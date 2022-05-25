
import java.util.Scanner;

public class Lettersfrequency {

    static Scanner s = new Scanner(System.in);

    public static String countLetters(String str)
    { 
        String str2 = "";

        int[] freq = new int[str.length()];  
        char str1[] = str.toCharArray();  

        for(int i = 0; i <str.length(); i++) 
        {  
            freq[i] = 1;  
            for(int j = i+1; j <str.length(); j++) 
            {  
               if(str1[i] == str1[j])
               {    
                 freq[i]++;    
                 str1[j] = '0';  
               }  
            }  
        }  

        for(int i = 0; i <freq.length; i++) 
        {  
            if(str1[i] != ' ' && str1[i] != '0')  
            {
               str2+= str1[i] + " : " + freq[i] + ",  "; 
            }
        }  

        return str2;
    }
    
    public void stringFrequency(){
        String str1;
        System.out.println("\n\n\nEnter the string : ");
        str1 = s.nextLine();
        System.out.println(countLetters(str1));


    }
}
