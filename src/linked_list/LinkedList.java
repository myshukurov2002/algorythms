package linked_list;

public class LinkedList<T> {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void showAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public Object getById(int id) {

        Node temp = head;
        int lId = 0;
        while (temp != null) {
            if (lId == id) {
                return temp.data;
            } else {
                lId++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public Object getFirst() {
        return (head == null) ? -1 : head.data;
    }

    public Object getLast() {
        return (tail == null) ? -1 : tail.data;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Object getMiddle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public boolean removeElement(Object element) {
        if (head == null) {
            return false;
        }
        if (head.data == element) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null) {
            if (current.data == element) {
                current.next = current.next.next;
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        head = head.next;
        return true;
    }

    public boolean removeLast() {
        if (tail == null) {
            return false;
        }
        tail = tail.next;
        return true;
    }

    public boolean removeById(int id) {
        if (head == null) {
            return false;
        }
        int tempId = 1;
        Node temp = head;

        if (id == 0) {
            return removeFirst();
        }

        while (temp.next != null) {
            if (tempId == id) {
                temp.next = temp.next.next;
                return true;
            } else {
                temp = temp.next;
                tempId++;
            }
        }
        return false;
    }

    public void addFirst(Object e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node temp = new Node(e);
            temp.next = head;
            head = temp;
        }
    }

    public void addLast(Object e) {
        if (tail == null) {
            tail = new Node(e);
        } else {
            Node temp = new Node(e);
            tail.next = temp;
            tail = temp;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public Node reverse() {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node reverseRecursive(Node head) {
        if (head == null) {
            return null;
        }
        Node rev = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}
