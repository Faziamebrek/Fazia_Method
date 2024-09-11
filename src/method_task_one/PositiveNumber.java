package method_task_one;


    // Write a Java program print whether a given number is positive or negative

    public class PositiveNumber {
        public boolean isPositive(int num) {
            if (num > 0) {
                return true;

            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            PositiveNumber positiveNumber = new PositiveNumber();
            boolean isPositive = positiveNumber.isPositive(-200);
            System.out.println(isPositive);
        }


}
