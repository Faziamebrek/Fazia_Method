package method_task_one;

public class Alphabet {
    public boolean isAlphabet(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        System.out.println(alphabet.isAlphabet('p'));

    }


}

