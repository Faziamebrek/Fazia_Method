package method_task_one;

public class PositiveNegative {//
    // Write a Java program print whether a given number is positive or negative


        public boolean isPositive(int num) {
            if (num > 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            PositiveNegative positiveNegative = new PositiveNegative();
            positiveNegative.isPositive(12);
            System.out.println(positiveNegative.isPositive(-12));

    }


}
