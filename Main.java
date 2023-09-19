import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        int a = input.nextInt();

        System.out.print("Please enter your second number: ");
        int b = input.nextInt();

                System.out.printf("%d + %d = %d%n" ,a,b,a+b);
    }
}