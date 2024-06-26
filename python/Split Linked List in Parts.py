# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def splitListToParts(self, head, k: int):
        l=[]
        len = 0
        temp = head
        while temp:
            len += 1
            temp = temp.next
        q,r = divmod(len,k)
        
        res, curr =[], head
        for i in range(k):
            dummy = write = ListNode(0)
            for _ in range(q+(i<r)):
                if curr:
                    write.next = write = ListNode(curr.val)
                    curr = curr.next
            res.append(dummy.next)
        return res