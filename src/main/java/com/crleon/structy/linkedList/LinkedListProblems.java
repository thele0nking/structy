package com.crleon.structy.linkedList;

import com.crleon.structy.common.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinkedListProblems {
  public static List<Integer> listValues(Node head) {
    List<Integer> result = new ArrayList<>();
    Node curr = head;

    while (curr != null) {
      result.add(curr.val);
      curr = curr.next;
    }

    return result;
  }

  public static int sumList(Node head) {
    int sum = 0;
    Node curr = head;
    while (curr != null) {
      sum += curr.val;
      curr = curr.next;
    }

    return sum;
  }

  public static boolean contains(Node head, int val) {
    Node curr  = head;

    while (curr != null) {
      if (curr.val == val) return true;
      curr = curr.next;
    }

    return false;
  }

  public static Optional<Integer> find(Node head, int index) {
    int i = 0;
    Node curr = head;

    while (curr != null) {
      if (i == index) return Optional.of(curr.val);
      i++;
      curr = curr.next;
    }

    return Optional.empty();
  }

  public static Node reverseList(Node head) {
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

  public static Node zipperList(Node head1, Node head2) {
    // Need to alternate between each node and change pointers in-place
    if (head1 == null) return head2;
    if (head2 == null) return head1;

    // Will help to know when to alternate adding nodes between both lists
    boolean addFromHead1 = false;
    Node curr1 = head1.next;
    Node curr2 = head2;
    Node result = head1;

    while (curr1 != null && curr2 != null) {
      if (addFromHead1) result.next = curr1;
      else result.next = curr2;
      result = result.next;
      curr1 = curr1.next;
      curr2 = curr2.next;
      addFromHead1 = !addFromHead1;
    }

    if (curr1 == null && curr2 == null) return head1;
    if (curr1 == null) result.next = curr2;
    if (curr2 == null) result.next = curr1;

    return head1;
  }
}
