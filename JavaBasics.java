import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter your roll number");
        // int x=sc.nextInt();
        // System.out.println("your roll number is: "+x);

        // System.out.println("* * * *\n* * *\n* *\n*");
        // byte a=127;
        // char ch='a';
        // System.out.println((int)ch);
        // int i=0;
        // while(i<10)
        // {
        // System.out.println(i+1);
        // i++;
        // }

        // int n = 334534534;
        // int rev = 0;
        // while (n > 0) {
        // int rem = n % 10;
        // rev = rev * 10 + rem;
        // n = n / 10;
        // // System.out.print(rem);

        // }
        // System.out.print(rev);
        int i = 2;
        int flag = 0;
        int num = 5;
        while (i < num) {
            if (num % i == 0) {
                System.out.println("number is not prime");
                flag = 1;
                break;

            }
            i++;
        }
        if (flag != 1)
            System.out.println("number is  prime");
    }
}
// ******************Java Notes********************

// 1) Java is a typed language means we have to define the variable datatype
// before declare a variable.
// 1) byte-1 byte
// 2) short-2 byte
// 3) char- 2 byte
// 4) boolean- 1 byte
// 5) int - 4 byte
// 6) long - 8 byte
// 7) float- 4 bytes
// 8) double- 8 bytes

// 2) Type conversion

// conversion happens when:
// a) type is compatible
// b) destination type >source type

// only type conversion possible in java is--->

// byte->short->int->float->long->double----->This Conversion is Called Implicit
// conversion or widening conversion.

// type conversion big to small(narrowing conversion) explicit---->

// float a=9.09;
// int b=(int)a;

/// Continue statement for skip iteration