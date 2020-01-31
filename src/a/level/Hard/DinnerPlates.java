package a.level.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class DinnerPlates {

    HashMap<Integer, Stack<Integer>> stacks = new HashMap<>();
    int max_capacity = 0;
    int index = 0;

    public DinnerPlates(int capacity) {
        max_capacity = capacity;
    }

    public void intialize() {
        Stack<Integer> values = new Stack<>();
        values.setSize(max_capacity);
        stacks.put(index, values);
    }


    public void push(int val) {
        if (stacks.get(index).size() < max_capacity) {
            stacks.get(index).add(val);
        } else {
            index++;
            intialize();
            push(val);
        }
    }

    public int pop() {
        if (!stacks.get(index).isEmpty())
            return stacks.get(index).pop();
        else {
            if (index > 0) index--;
            else return -1;
            pop();
        }
        return -1;
    }

    public int popAtStack(int index) {
        return stacks.get(index).isEmpty() ? -1 : stacks.get(index).pop();
    }
}
