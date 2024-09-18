package leetcode.models;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Jum 09:40. 16/12/22
 */

class MyQueue {

    private final List<Integer> myQueueList;

    public MyQueue() {
        this.myQueueList = new LinkedList<>();
    }

    public void push(int x) {
        this.myQueueList.add(x);
    }

    public int pop() {
        int tmp = this.myQueueList.get(0);
        this.myQueueList.remove(0);
        return tmp;
    }

    public int peek() {
        return this.myQueueList.get(0);
    }

    public boolean empty() {
        return this.myQueueList.isEmpty();
    }
}