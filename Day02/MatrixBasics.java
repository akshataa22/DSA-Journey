package Day02;

public class MatrixBasics {
    public static void main(String[] args) {

        //2D array
        int[][] matrix = {
        // col
        //   0  1  2 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrix[2][0]);

        // Traversing 2D arrays
        // Outer loop → rows
// Inner loop → columns
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
        }
    }

    // sum of all elements
    int sum = 0;
    for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
        }
    }
    System.out.println("Sum of matrix is " + sum);

    //maximum element
    int max = 0;
    for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
              if (max < matrix[i][j]) {
                max = matrix[i][j];
              }
        }
    }
    System.out.println("Max is "+max);


    // printing each row
     for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    //Printing the matrix in reverse row order
      for(int i = matrix.length -1; i >=0; i--) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }


    String name = "Akshata";
    System.out.println(name.length());
System.out.println(name.charAt(0));
System.out.println(name.charAt(2));

System.out.println("Substring: " + name.substring(0, 3));
System.out.println("Uppercase sting: " + name.toUpperCase());
System.out.println(name.equals("Hello World"));
System.out.println("ignore case compare: " +name.equalsIgnoreCase("akshata"));

String str = "Hello";
str = str + " World";

System.out.println("Str : " +str);

//for repeated modifying
StringBuilder sb = new StringBuilder("Hello");
sb.append("world.");
System.out.println("Str with stringbuilder: " +str);

// StringBuilder sbnew = new StringBuilder("Hello");
sb.insert(5, " Java ");
System.out.println("Str with insert: " +sb);

sb.delete(5, 10);
System.out.println("Deleted indexes: "+ sb);

sb.toString();
System.out.println("To String: "+ sb);

// Character manipulation
char ch = 'A';
System.out.println("Is letter: " + Character.isLetter(ch));

//ascii character
System.out.println((int) ch);
System.out.println((int) 'a');
System.out.println((int) '0');
}
}
