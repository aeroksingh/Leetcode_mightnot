class Solution {
    public Node copyRandomList(Node head) {

        HashMap<Node, Node> old = new HashMap<>();

        // null should map to null
        old.put(null, null);

        // Step 1: Create all copied nodes
        Node curr = head;

        while (curr != null) {
            Node copy = new Node(curr.val);
            old.put(curr, copy);

            curr = curr.next;
        }

        // Step 2: Connect next and random pointers
        curr = head;

        while (curr != null) {
            Node copy = old.get(curr);

            copy.next = old.get(curr.next);
            copy.random = old.get(curr.random);

            curr = curr.next;
        }

        return old.get(head);
    }
}