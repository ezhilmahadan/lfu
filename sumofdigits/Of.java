import java.util.Scanner;
public class Of{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scanner.nextInt();
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        } 
        System.out.println("the sum of the digits is:"+sum);
        scanner.close();
        }
}