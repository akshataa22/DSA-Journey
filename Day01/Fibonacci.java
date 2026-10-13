package Day01;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int first = 0;
        int second = 1;
        for(int i = 1;i <= n; i++) {
             System.out.println(first);
         
            int temp = first + second ;
             first = second;
       second = temp;
        }
    }
}
