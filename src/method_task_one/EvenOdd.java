package method_task_one;
public class EvenOdd {
    public void PrintEvenOdd (int a){

        if (a % 2 == 0) {
            System.out.println(a+ "is an even Number ");

        } else {
            System.out.println( a+ "is an Odd Number");
        }

    }

    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.PrintEvenOdd(15);

    }
}













