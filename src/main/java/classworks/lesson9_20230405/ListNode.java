package classworks.lesson9_20230405;

import java.util.LinkedList;

public class ListNode {
  int value;
  ListNode next;

  public ListNode(int value) {
    this.value = value;
  }

  public ListNode(int value, ListNode next) {
    this.value = value;
    this.next = next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }

  public static boolean hasCycle(ListNode head) {
    ListNode first = head;
    ListNode second = head.next;

    while (first != second){
      if ((first == null) || (second.next == null)){
        return false;
      }
      first = first.next;
      second = second.next;
    }
    return true;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(5);

    l2.setNext(l1);
    l3.setNext(l2);
    l4.setNext(l5);
    l5.setNext(l3);

    System.out.println(hasCycle(l3));
  }
}
