package method_task_two;

//Write a Java program to display the first 10 natural numbers.

    public class DisplayTenFirst {
        public void DisplayNumbers(int n) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            DisplayTenFirst displayTenFirst = new DisplayTenFirst();

            displayTenFirst.DisplayNumbers(10);

        }
    }


