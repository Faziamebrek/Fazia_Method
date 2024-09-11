package method_task_one;

public class LargestNumber {
    //write Java Program to Find the Largest Among two Numbers

    public int findLargestNumber(int a, int b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        int max = largestNumber.findLargestNumber(12, 100);
        System.out.println(largestNumber.findLargestNumber(12, 100));

    }
}


