package Day02;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
//output - 5 4 3 2 1
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

//output - {5, 4, 3, 2, 1}
        int left = 0;
        int right = arr.length - 1;

            while(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
System.out.println("---------------");
System.out.print("{");
for(int i =0; i<arr.length; i++) {
    System.out.print(arr[i]);
 if (i < arr.length - 1) {
        System.out.print(", ");
    }
}
System.out.println("}");
        }
}
