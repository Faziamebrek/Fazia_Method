package method_task_one;

//write a program to check whether a character is uppercase or lowercase alphabet


    public class LowerUperCase {
        public String findAboutCharacter(char ch) {
            if (ch >= 'A' && ch <= 'Z') {
                return "is uppercase";
            } else if (ch >= 'a' && ch <= 'z') {
                return "is lowercase";
            } else {
                return "invalid";
            }
        }

        public static void main(String[] args) {
            LowerUperCase lowerUperCase = new LowerUperCase();
            String ch = lowerUperCase.findAboutCharacter('l');
            System.out.println(lowerUperCase.findAboutCharacter('S'));
        }


    }


