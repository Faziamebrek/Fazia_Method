package method_task_two;

public class DisplayOdd {
    //write java program to display the odd number from 0 to 20


    public void PrintOdd(int num, int end) {
        for (int i = num; i <= end; i = i + 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        DisplayOdd displayOdd = new DisplayOdd();
        displayOdd.PrintOdd(0, 20);

    }
}
