package Day02;

public class ArrayBasics {

    public static void main(String[] args) {

        //1D array
          int[] numbers = {10, 20, 30, 40, 50};
          int[] number2 = {34,54,23,6,44}; 

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[4]);

        for (int number : numbers) {
    System.out.println(number);
}

System.out.println(number2[0]);

//Print numbers
for(int i = 0;i<numbers.length; i++) {
    System.out.println("Printing numbers: " + numbers[i]);
}

//Even numbers from array
for(int i =0;i < numbers.length; i++) {
    if(numbers[i] %2 == 0) {
        System.out.println("Even numbers in array: " + numbers[i] );
    }
}

//sum
int sum = 0;
for (int i=0;i<numbers.length;i++) {
    sum += numbers[i];
}
System.out.println("Sum of array: "+sum);

//average of array
int avg = 0;
for(int i = 0 ; i<numbers.length ; i++) {
    int temp = 0;
    temp += numbers[i];
    
    avg = sum/2;
}
System.out.println("Average of arrray: " +avg);

for(int i = 0;i<numbers.length;i++) {
if(numbers[i] > 10) {
    System.err.println("Greater than 10: " + numbers[i]);
}
}

//finding a number in an array
 int target = 30;
for(int i=0;i<numbers.length;i++) {
    if(numbers[i] == target ){
    System.out.println("found");
    } else {
        System.out.println("not found.");
    }
}

}
}