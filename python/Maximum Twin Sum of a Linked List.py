# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head) -> int:
        fast = slow = head
        stack = []
        mts = 0

        while (fast and fast.next):
            fast = fast.next.next
            stack.append(slow)
            slow = slow.next
        
        while slow:
            mts = max(mts, stack.pop().val + slow.val)
            slow = slow.next
        
        return mts