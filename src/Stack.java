import java.util.ArrayList;
import java.util.Scanner;

public class Stack extends Abstract_Stack {

    ArrayList<Integer> list = new ArrayList<>();

    @Override
    public int pop(){
        return list.remove(list.size()-1);
    }

    @Override
    public void push(int i){
        list.add(i);
    }

}
