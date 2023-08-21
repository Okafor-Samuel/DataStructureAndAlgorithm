
    class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public class LinkedList {
        public ListNode reverseLinkedList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = reverseLinkedList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

        //The above was what is expected of us.
        //Below is what is needed for it to run on your IDE
        public static void main(String[] args) {
            // Creating a sample linked list: 0 -> 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(0);
            head.next = new ListNode(1);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next = new ListNode(5);
            LinkedList reverser = new LinkedList();
            ListNode newHead = reverser.reverseLinkedList(head);
            // Printing the reversed linked list: 5 -> 4 -> 3 -> 2 -> 1 -> 0
            while (newHead != null) {
                System.out.print(newHead.value + " ");
                newHead = newHead.next;
            }
        }
    }

