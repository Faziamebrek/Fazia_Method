package method_task_one;

public class MultipleOfFive {
    //Write a Java program to check whether the given integer is a multiple of 5

        public boolean isMultiple ( int a){
            if ( a%5==0){
                return true;
            }else{
                return false;
            }
        }

        public static void main(String[] args) {
            MultipleOfFive multipleOfFive = new MultipleOfFive();
            boolean isMul = multipleOfFive.isMultiple(12);
            System.out.println(multipleOfFive.isMultiple(20));

        }


}
