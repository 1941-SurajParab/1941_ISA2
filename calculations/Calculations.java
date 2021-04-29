package operations;
import java.util.Scanner;
public class Calculations 
{
    public static void main(String[] args) 
    {
        int num1, num2, opt, add, sub, mul;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 to Exit");
            opt = scanner.nextInt();
            switch(opt)
            {
                case 1:
                add = num1 + num2;
                System.out.println("Result:"+add);
                break;
 
                case 2:
                sub = num1 - num2;
                System.out.println("Result:"+sub);
                break;
 
                case 3:
                mul = num1 * num2;
                System.out.println("Result:"+mul);
                break;

                case 4:
                System.exit(0);
            }
        }
    }
}
