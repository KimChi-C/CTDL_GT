public class MyLinkedListQueue implements IStackQueue {

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;

        }
    }

    // co 2 thao tác chỉnh: them phan tu vao dau linked list (push) va xoa phan tu
    // cuoi cua linked list (pop)
    Node headNode;
    Node tailNode;

    MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false;

        }
        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else { // them node vao cuoi linked list
            tailNode.next = newNode;
            tailNode = newNode;

        }
        // always keep tracking tail pointer
        return true;
    }

    @Override
    public int pop() {

        if (isEmpty()) {
            return -1;
        }
        int value = headNode.value;
        if (headNode == tailNode) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }

        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        Node curNode = headNode;
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}