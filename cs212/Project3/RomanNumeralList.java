public class RomanNumeralList {

  protected ListNode first = new ListNode(null);
  protected ListNode last = first;
  protected int length = 0;

  public int getLength() {
    return length;
  }

  public void append(RomanNumeral d) {
    ListNode n = new ListNode(d);
    last.next = n;
    last = n;
    length++;
  }

  public void prepend(RomanNumeral d) {
    ListNode n = new ListNode(d);
    n.next = first.next;
    first.next = n;
    length++;
  }

  public String toString() {
    ListNode p = first.next;
    String returnString = "";
    while (p != null) {
      returnString += p.data.toString() + " ";
      p = p.next;
    }
    return returnString;
  }

  public boolean equals(Object other) {
    if (
      other == null ||
      getClass() != other.getClass() ||
      length != ((RomanNumeralList) other).length
    ) return false;

    ListNode nodeThis = first;
    ListNode nodeOther = ((RomanNumeralList) other).first;
    while (nodeThis != null) {
      if (!nodeThis.data.equals(nodeOther.data)) return false;

      nodeThis = nodeThis.next;
      nodeOther = nodeOther.next;
    }

    return true;
  }

  protected class ListNode {

    protected RomanNumeral data;
    protected ListNode next;

    protected ListNode(RomanNumeral data) {
      this.data = data;
      this.next = null;
    }
  }
  public RomanNumeral get(int index) {
    if (index < 0 || index >= length) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
    }

    ListNode currentNode = first.next;
    for (int i = 0; i < index; i++) {
        currentNode = currentNode.next;
    }

    return currentNode.data;
}
}
