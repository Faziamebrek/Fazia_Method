package method_task_one;

//Write java program to input any alphabet and check whether it is vowel or consonant

    public class VoelConsenan {
        public boolean isVoel (char vo){
            if (vo== 'a'|| vo=='e'|| vo=='i'|| vo=='o'|| vo== 'u') {
                return true;
            }else{
                return false;
            }
        }

        public static void main(String[] args) {
            VoelConsenan voelConsenan = new VoelConsenan();
            voelConsenan.isVoel( 's');
            System.out.println(voelConsenan.isVoel('a'));
        }

}
