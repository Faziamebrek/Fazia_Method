package method_task_one;

public class DivisibleByFive {
    //write java Program to Check Whether Number is Divisible by 5
    public boolean isDivisible(int num) {
        if (num % 5 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        divisibleByFive.isDivisible(15);
        System.out.println(divisibleByFive.isDivisible(21));
    }

}
