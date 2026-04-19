package com.leetcode.problems.problems;
/// Leetcode problem : 83
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * struct ListNode {
 * int val;
 * ListNode *next;
 * ListNode() : val(0), next(nullptr) {}
 * ListNode(int x) : val(x), next(nullptr) {}
 * ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
public class RemoveDuplicatesFromSortedList {

    ListNode head = new ListNode();

    public RemoveDuplicatesFromSortedList() {
    }

    public RemoveDuplicatesFromSortedList(List<Integer> vals) {
        ListNode head = this.head;
        this.head.val = vals.get(0);

        for (int i = 1; i < vals.size(); i++) {
            this.head.next = new ListNode(vals.get(i));
            this.head = this.head.next;
        }

        this.head.next = null;
        this.head = head;
    }

    public void create(List<Integer> vals) {
        ListNode head = this.head;
        this.head.val = vals.get(0);

        for (int i = 1; i < vals.size(); i++) {
            this.head.next = new ListNode(vals.get(i));
            this.head = this.head.next;
        }

        this.head.next = null;
        this.head = head;
    }

    public ListNode getHead() {
        return this.head;
    }

    public void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //1,1,2,2,3,4,4,5 -> 1,2,3,4,5
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        ListNode prev = head;
        List<Integer> unique = new ArrayList<>();
        /*while (head != null && head.next != null) {
            if (unique.contains(head.val)) {
                prev.next = head.next;
                unique.remove(head.val);
            } else {
                unique.add(head.val);
                prev = newHead;
            }
            head = head.next;
        }*/

        while (head != null) {
            if (!unique.contains(head.val)) {
                unique.add(head.val);
            }
            head = head.next;
        }

        create(unique);

        return this.head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}