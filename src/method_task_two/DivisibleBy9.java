package method_task_two;

    public class DivisibleBy9 {
    public void GetSumDivBy9(int start, int end) {
        int  sum=0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0){

                sum= sum+1;
                System.out.println(i+ " ");
            }
        }

    }
    public static void main (String[]args){
        DivisibleBy9 divisible = new DivisibleBy9();
        divisible.GetSumDivBy9(100, 200);
    }

}
