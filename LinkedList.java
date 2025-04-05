public class LinkedList {
    static Node head;

    public static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void add(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display()
    {
        if (head == null)
        {
            return;
        }

        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void findMiddle()
    {
        if (head == null)
        {
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle : " + slow.data);
    }

    public boolean hasCycle()
    {
        if (head == null)
        {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                return true;
            }
        }

        return false;
    }

    public void createCycle() {
        if (head == null)
        {
            return;
        }

        Node curr = head;
        while (curr.next != null)
        {
            curr = curr.next;
        }

        curr.next = head.next;
    }

    public Node reverseLinkedList()
    {
        Node prev = null;
        Node next;
        Node curr = head;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        //list.createCycle();
        System.out.println(list.hasCycle() ? "Cycle" : "No cycle");
        head = list.reverseLinkedList();

        list.display();
        list.findMiddle();
    }
}
