package method_task_two;

//Write a program to find avg of all natural numbers between 2 to 8
    public class AverageNumbers {
        public int findAvg(int start, int end) {
            int sum = 0;
            int avg;
            for (int i = start; i <= end; i++) {
                sum= sum+i;
            }
            avg=sum/7;
            return avg;
        }
        public static void main(String[] args) {
            AverageNumbers averageNumbers = new AverageNumbers();
            int avg= averageNumbers.findAvg(2,8);
            System.out.println(avg);
        }
}
