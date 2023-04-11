public class SortedRomanNumeralList extends RomanNumeralList{
    public void add(RomanNumeral x){
        ListNode newNode = new ListNode(x);
        ListNode current = first;
        while (current.next != null && current.next.data.compare(x) < 0) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        length++;
    }
}
