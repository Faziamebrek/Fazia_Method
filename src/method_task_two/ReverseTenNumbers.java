package method_task_two;

//Write a Java program to display the first 10 natural numbers in reverse

public class ReverseTenNumbers {
    public void FindRevers10first(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ReverseTenNumbers reverseTenNumbers = new ReverseTenNumbers();
        reverseTenNumbers.FindRevers10first(10);
    }

}
