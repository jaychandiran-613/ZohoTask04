import java.util.Scanner;

public class Countstring {
    static Scanner s = new Scanner(System.in);

    public int[] countLetters(String str1) {
        int a[]={0,0,0,0};
        for(int i=0; i<str1.length(); i++){
            char ch=str1.charAt(i);
            if(ch>='A' && ch<='Z'){
                a[0]++;
            }
            else if(ch>='a' && ch<='z'){ 
                a[1]++;
            }
            else if(ch>='0' && ch<='9'){
                a[2]++;
            }
            else{
                a[3]++;
            }
        }
        return a;

        
    }

    public void countStr()
    {
        String str1;
        int a[];
        System.out.println("\n\nEnter the string to count cases : ");
        str1 = s.nextLine();
        a = countLetters(str1);
        System.out.print("The Uppercase Lowercase integer Specialcase in string : \n");
        for(int i =0 ; i<4;i++)
        {
            System.out.print(a[i]+ " ");

        }




    }

    
}
