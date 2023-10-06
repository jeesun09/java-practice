import java.util.*;
public class PrimeNumberProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = num/2;
        int flag = 0;
        if(num == 0||num==1){
            System.out.println(num+" is not a prime number");
        }
        else{
            for(int i = 2; i<=m; i++){
                if(num%i==0){
                    System.out.println(num+" is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) System.out.println(num + " is a prime number");
        }
    }
}
