import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true){
            System.out.print("Input new int for stack or pop(p): ");
            input = scanner.next();

            if(input.equals("p")){
                System.out.println("Calling pop method");
                stack.pop();
            }
            else {
                System.out.println("Adding int: " + input);

                stack.push(Integer.parseInt(input));
            }


            System.out.println("Stack:");
            for(int i=stack.list.size(); i>0; i--){
                System.out.println(stack.list.get(i-1));
            }
        }
    }
}
