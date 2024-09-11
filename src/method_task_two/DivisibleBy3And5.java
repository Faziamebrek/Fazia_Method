package method_task_two;

public class DivisibleBy3And5 {
    //write java Program to print all the numbers divisible by 3 and 5 from 0 to 100


    public void ListDivisibleNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        DivisibleBy3And5 divisibleBy3And5 = new DivisibleBy3And5();
        divisibleBy3And5.ListDivisibleNumbers(0, 100);

    }

}
