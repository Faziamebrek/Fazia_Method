package method_task_one;

public class Calculator {
    public void getCalculation(int num1, int num2, char ch) {

        int a = 18;
        int b = 6;
        switch (ch) {
            case ('+'):
                System.out.println(a + b);
                break;
            case ('-'):
                System.out.println(a - b);
                break;
            case ('*'):
                System.out.println(a * b);
                break;
            case ('/'):
                System.out.println(a / b);
                break;
            case ('%'):
                System.out.println(a % b);
                break;
            default:
                System.out.println(" invalid operator");

        }
    }


        public static void main (String[]args){
            Calculator calculatorJava = new Calculator();


            calculatorJava.getCalculation(3, 5, '+');
        }
    }

