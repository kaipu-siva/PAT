class QueueUsingSingleStack:
    def init(self):
        self.stack=[]
        
    def enqueue(self,item):
        self.stack.append(item)
    
    def dequeue(self):
        if not self.stack:
            return "Queue is empty"
        elif len(self.stack)==1:
            return self.stack.pop()
        else:
            # Recursive call to dequeue all but the last element
            front=self.stack.pop()
            dequeued_item=self.dequeue()
            self.stack.append(front)
            return dequeued_item
        
    def peek(self):
        if not self.stack:
            return "Queue is empty"
        return self.stack[0]
    
    def is_empty(self):
        return not self.stack
    
#Example usage:
queue=QueueUsingSingleStack()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
print(queue.dequeue())
print(queue.peek())
print(queue.dequeue())
print(queue.is_empty())
print(queue.dequeue())
print(queue.is_empty())
print(queue.dequeue())
