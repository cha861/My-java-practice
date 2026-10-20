import java.util.Scanner;
public class Input{
    public static void main(String[] args){

       int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("entered value is: " + n);
        sc.close();
    }
}