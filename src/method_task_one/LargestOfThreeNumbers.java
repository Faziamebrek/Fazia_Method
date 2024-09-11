package method_task_one;

public class LargestOfThreeNumbers {
    //write Java Program to Find the Largest Among Three Numbers

    public int FindLargestOfThreeNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        LargestOfThreeNumbers largestOfThreeNumbers = new LargestOfThreeNumbers();
        largestOfThreeNumbers.FindLargestOfThreeNumbers(12, 120, 80);
        System.out.println(largestOfThreeNumbers.FindLargestOfThreeNumbers(12, 120, 80));
    }
}


