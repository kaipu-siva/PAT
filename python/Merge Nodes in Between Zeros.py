# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeNodes(self, head):
        dummy = ListNode()
        dummy.next = head
        curr = dummy

        while curr.next:
            prev = curr
            if curr.next.val == 0:
                curr = curr.next
            if curr.next:
                curr.val += curr.next.val
                curr.next = curr.next.next
        prev.next = None
        return head