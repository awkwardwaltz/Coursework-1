
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;
    public static boolean noArgument;
    public static String hexadecimal;
    public static void main(String args[])
    {
        if (args.length == 0){
        	noArgument = true;
            System.out.println("You cannot run this code without a command line argument");
        } else {
            try{
            noArgument = false;
        Arg1 = Integer.parseInt(args[0]);
        }
        catch(Exception e) {
            System.out.println("You must enter a whole number.");
        }
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        hexadecimal="";
        if (num != 0){
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    } 
    }
    }
}

