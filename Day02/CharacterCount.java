package Day02;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "programming";

        for(int i = 0;i <str.length();i++) {
            int count = 0;
            for (int j = 0 ; j<str.length();j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

               // Print only the first occurrence of each number
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(str.charAt(i) + " -> " + count);
            }
        }
    }
}
