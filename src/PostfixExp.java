public class PostfixExp {

    public static void main(String[] args) {

        int result = calculate("234+*");
    }

    public static int calculate(String test){
        Stack stack = new Stack();
        String test1 = test;
        int a;
        int b;
        int result = 0;
        char charc;

        for(int i=0; i<test1.length(); i++){
            charc = test1.charAt(i);

            switch (charc){
                case '+':
                    a = stack.pop();
                    b = stack.pop();
                    result = a + b;
                    stack.push(result);
                    break;

                case '-':
                    a = stack.pop();
                    b = stack.pop();
                    result = a - b;
                    stack.push(result);
                    break;

                case '*':
                    a = stack.pop();
                    b = stack.pop();
                    result = a * b;
                    stack.push(result);
                    break;

                case '/':
                    a = stack.pop();
                    b = stack.pop();
                    result = a / b;
                    stack.push(result);
                    break;

                default:
                    stack.push(Character.getNumericValue(charc));
                    break;
            }
            System.out.println("Result: " + result);

        }

        return result;
    }
}
