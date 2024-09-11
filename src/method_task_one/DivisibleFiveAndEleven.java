package method_task_one;

// Write a program to check whether a number is divisible by 5 and 11 or not

    public class DivisibleFiveAndEleven {
        public boolean isDivisible(int num) {
            if (num % 5 == 0 && num % 11 == 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            DivisibleFiveAndEleven divisibleFiveAndEleven= new DivisibleFiveAndEleven();
            divisibleFiveAndEleven.isDivisible(100);
            System.out.println(divisibleFiveAndEleven.isDivisible(100));

        }
    }



