import java.util.Scanner;

//This is a class that do Mathimatical  calculations
public class AboutNumbers {

    //This is the main method

    public static void main(String arg[]) {
        int num1, num2,num3;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        num1 = keyboard.nextInt();
        System.out.println("please enter the second number");
        keyboard = new Scanner(System.in);
        num2 = keyboard.nextInt();
        System.out.println("please enter the third number");
        keyboard = new Scanner(System.in);
        num3 = keyboard.nextInt();

        System.out.println("Your numbers are "+num1+ ","+ num2+", and "+ num3);
        System.out.println("The higest number is " + highestNumber(num1, num2, num3));
        System.out.println("The lowest number is " + lowestNumber (num1, num2, num3));
        System.out.println("The sum of the numbers is "+ sum(num1,num2,num3));
        System.out.println("The product of the numbers is " + product(num1, num2, num3));
        System.out.println("The Average of the numbers is " + average(num1, num2, num3));
    }
    //This is the method that tells us the higest number of the three numbers
    public static int highestNumber(int num1, int num2,int num3) {
        int highestNumber=1;
        if (  num3>num2) {
            highestNumber = num3;
        }else if (num2 > num1)
        {
            highestNumber=num2;
        }else{
            highestNumber=num1;
        }

        return highestNumber;

    }
    //This is the method that tells us the lowest number of the three numbers
    public static int lowestNumber (int num1, int num2, int num3) {
        int lowestNum=1 ;
        if (num1 < num2) {
            lowestNum = num1;
        }else if(num2<num3)
        {
            lowestNum=num2;
        }else{
            lowestNum=num3;
        }
        return lowestNum;

    }

    //This is the method that sums the three numbers

    public static int sum (int num1, int num2, int num3)
    {
        int sum=num1+num2+num3;
        return sum;

    }

    // //This is the method that product of  the three numbers
    public static int product (int num1, int num2, int num3)
    { int prod=num1*num2*num3;
        return prod;
    }
    //This is the method that gives us the average of  the three numbers
    public static double average (int num1, int num2, int num3)
    {
        double avg=((num1+num2+num3)/3);
        return avg;
    }
}
