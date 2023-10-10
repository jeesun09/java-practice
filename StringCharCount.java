//Java Program to count the total number of characters in a string

public class StringCharCount {
    public static void main(String[] args) {
        String name = "Hello World";
        int count =0;
        for(int i = 0; i<name.length(); i++){
            if(name.charAt(i) !=' '){
                count += 1;
            }
        }
        System.out.println("Total number of char in that string is : "+ count);
    }
}
