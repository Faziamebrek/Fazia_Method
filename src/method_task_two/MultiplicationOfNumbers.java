package method_task_two;

public class MultiplicationOfNumbers {
    public int findMul(int num, int end) {
        int mul = 1;
        for (int i = num; i <= end; i++) {
            mul = mul * i;
        }
        return mul;
    }

    public static void main(String[] args) {
        MultiplicationOfNumbers multiplicationOfNumbers= new MultiplicationOfNumbers();
        int mul= multiplicationOfNumbers.findMul(1,10);
        System.out.println(mul);
    }


}
