package method_task_two;

public class FebonacciSerrie {
    public int findFebonacci(int limit) {
        int a = 0, b = 1;
        while (a <= limit) {
            System.out.println(a + "");
            int next = a + b;
            a = b;
            b = next;
        }
        return limit;
    }

    public static void main(String[] args) {
        FebonacciSerrie febonacciSerrie = new FebonacciSerrie();
        int limit = febonacciSerrie.findFebonacci(10);
    }

}
