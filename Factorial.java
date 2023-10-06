public class Factorial {
    public static void main(String[] args) {
        int num = 4;
        int ans = factorialOf(num);
        System.out.printf("Factorial of " + num + " is "+ ans);
    }
    static int factorialOf(int num){
        if(num<1){
            return 1;
        }
        return (num*(factorialOf(num-1)));
    }
}
