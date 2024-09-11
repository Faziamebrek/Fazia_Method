package method_task_two;

public class DisplayEvenNumbers {
    //write java program to display the even number from 10 to 30
    //
    public void PrintEvenNumbers(int num,int end ){
        for ( int i =num; i<=end;i=i+2){
            if (i%2==0);
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        DisplayEvenNumbers displayEvenNumbers= new DisplayEvenNumbers();
        displayEvenNumbers.PrintEvenNumbers(10,30);

    }
}



