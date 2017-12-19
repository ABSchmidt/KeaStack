import java.util.Stack;

public class Tuborgklammer {

    public static void main(String[] args) {
        String testString1 = "He{{o Wor}d}";
        String testString2 = "Goodbye Wor{d";
        String testString3 = "Goodbye} Word";
        boolean tf;

        //Test 1
        tf = test(testString1);
        if(tf == true){
            System.out.println("testString1: Succes");
        }
        else {
            System.out.println("testString1: Failed");
        }

        //Test 2
        tf = test(testString2);
        if(tf == true){
            System.out.println("testString1: Succes");
        }
        else {
            System.out.println("testString1: Failed");
        }

        //Test 3
        tf = test(testString3);
        if(tf == true){
            System.out.println("testString1: Succes");
        }
        else {
            System.out.println("testString1: Failed");
        }

    }

    public static boolean test(String str){
        boolean boo = false;
        Stack<Integer> list = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='{'){
                list.push(1);
            }
            else if(str.charAt(i)=='}'){
                if(list.size()>0){
                    list.pop();
                }
                else {
                    list.push(1);
                }
            }
        }

        if(list.size()==0){
            boo = true;
        }

        return boo;
    }
}
