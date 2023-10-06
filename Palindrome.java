import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem, temp, newNum=0;
        temp = num;
        while(temp>0){
            rem = temp%10;
            newNum = (newNum*10)+rem;
            temp = temp/10;

        }
        if(num == newNum) System.out.println(num+" is palindrome");
        else System.out.println(num+" is not palindrome");

    }
}
