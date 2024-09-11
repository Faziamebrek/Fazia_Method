package method_task_two;

    //Write a program to find sum of all natural numbers between 1 to 10

    public class SumOfTenFirstNumber {
        public int findSum(int start, int end) {
            int total = 0;
            for (int i = start; i < end; i++) {
                total = total + i;
            }
            return total;
        }

        public static void main(String[] args) {
            SumOfTenFirstNumber sumOfTenFirstNumber=new SumOfTenFirstNumber();
            int i =sumOfTenFirstNumber.findSum(1,10);
            System.out.println(i);
        }



    }
