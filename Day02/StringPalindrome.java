package Day02;

public class StringPalindrome {
    public static void main(String[] args) {
        String palString = "madam";
        String rev = "";
        for(int i = palString.length()-1; i >=0; i--) {
            rev += palString.charAt(i);
        }

        if(palString.equals(rev)) {
            System.out.println("is palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }


//-----------------------------------------------------

int left = 0;
int right = palString.length() - 1;
boolean isPalindrome = true;
while(left < right) {
    if (palString.charAt(left) != palString.charAt(right) ) {
        isPalindrome = false;
        break;
    }

    left++;
    right--;
}
    if(isPalindrome) {
                   System.out.println("is a palindrome.");
    } else {
        System.out.println("not a palindrome.");
    }


    }
}
