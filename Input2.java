import java.util.Scanner;
public class Input2{
    public static void main(String[] args){

        int a,b,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a*b is :" + (a*b));

        //Area of circle
        System.out.println("Enter radius of circle: ");
        r = sc.nextInt();
        System.out.println("Area of circle is: " + (3.14*r*r));
        sc.close();
    }
}