import java.lang.Math;
import java.util.Scanner;

public class calculator {
    public static void calcValues(){
        Scanner xxx = new Scanner(System.in);
        System.out.println("type a number for num1: ");
        double num1 = xxx.nextDouble();
        System.out.println("type a number for num2: ");
        double num2 = xxx.nextDouble();
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(Math.pow(num1, 2) + "+" + Math.pow(num2,2) + "=" + (Math.pow(num1, 2) + Math.pow(num2,2)));
    }

    public static void main(String[] args) {
        calculator.calcValues();
    }
}
