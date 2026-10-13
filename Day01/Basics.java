package Day01;

public class Basics {

//methods outside main
    static int sum (int a,int b) {
        return a+b;
    }

    static int square(int a) {
        return a *=a;
    }

    static boolean isEven(int a) {
        return a %2 == 0;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    

    static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while(i <= n) {
         fact = fact * i;
         i++;
        }
         return fact;
    }

    public static void main(String[] args) {

        //Data types in Java
        int age = 25;
        long population = 1000000000L;
        double price = 12.33;
        float temperature = 23f;
        char grade = 'A';
        String name = "Swayam";

        

        //Operators in Java
        int a = 10;
        int b = 10;

        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        int lessThan = a<b ? a : b;
        int moreThan = a>b ? a : b;
        int equalTo = a==b ? 1 : 0;
        int notEqualTo = a!=b ? 1 : 0;

        System.out.println(age);
        System.out.println(population);
        System.out.println(price);
        System.out.println(temperature);
        System.out.println(grade);
        System.out.println(name);

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(lessThan);
        System.out.println(moreThan);
        System.out.println(equalTo);
        System.out.println(notEqualTo);

        //if/else statement in Java
        if(age > 18) {
            System.out.println("Adult."); 
        }else if (age < 18) {
            System.out.println("Not an adult.");
        } else {
            System.out.println("Age is 18.");
        }

        //loops in Java
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }
        for(int i=5;i>0;i--) {
            System.out.println(i);
        }
        int i = 4;
        while(i<= 4) {
            System.out.println("Hello");
            i++;
        }
        //even
        for(int j=0;j<=10;j++) {
            if(j%2 == 0 ) {
                System.out.println(j);
            }
        }
        //add operation through loop
        for (int j=0;j<=100;j++) {
            sum += j;
        }
        System.out.println("Sum: " + sum);


        //factorial of a number
        int num = 10;
        int fact = 1;
        for(int j=1;j<=num;j++) {
            fact = j * fact;
            System.out.println("Factorial of " + j + " is: " + fact);
        }

        //multiplication table
        int number = 5;
        for (int j=1;j<=10;j++) {
            System.out.println(number + "x" + j + "=" + (number * j));
        }

        int result = sum(5,15);
        System.out.println("result: " + result);

int sq = square(3);
System.out.println("Square: " + sq);

System.out.println(isEven(10));

System.out.println(max(10,22));
System.out.println(factorial(5 ));

//scope & typecasting
int x = 20;
if(true) {
    int y = 22;
System.out.println("y is "+ y);   //y exists only inside this block
System.out.println("x is "+ x);   
}
System.out.println("x is "+ x);   

double xy = 10.5;

int y = (int) xy;

System.out.println(y);
    }

}
