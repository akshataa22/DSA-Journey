package Day01;

public class Prime {

    static boolean isPrime(int a) {
        if(a <2 ) {
            return false;
        }
        if (a % 2 == 0) {
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        boolean result = isPrime(13);
            System.out.println(result);


    }
}
