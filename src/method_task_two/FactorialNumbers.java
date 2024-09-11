package method_task_two;
//Write a Java program to find the factorial of a given number.
public class FactorialNumbers {
    public int factorial(int i) {
        int fact = 1;
        int num = 12;
        for ( i =1; i<=12; i++){
            fact = fact*i;
            System.out.println(fact);

        }return fact;
    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumber = new FactorialNumbers();
        int fact = factorialNumber.factorial(12);

    }
}




