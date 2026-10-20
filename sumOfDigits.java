public class sumOfDigits{
    public static void main(String[] args){
        int num = 1234;

    int sum = 0;
    int temp = num;
    while(temp!=0){
        int a=temp%10;
        sum = sum+a;
        temp=temp/10;
        
    }
    System.out.println("Sum of digits is: " + sum);
}
}