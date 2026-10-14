package Day02;

public class ReverseString {

    public static void main(String[] args) {
        String arr = "hello";


        StringBuilder sb = new StringBuilder(arr);
        sb.reverse();
        System.out.println(sb);

        // with loop
        String rev = "";
for(int i = arr.length() - 1; i >= 0; i--) {
    rev += arr.charAt(i);
}
System.out.println("rev: "+rev);
        
    }

}
