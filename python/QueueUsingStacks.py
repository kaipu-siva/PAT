class QueueUsingStacks:
    def init(self):
        self.stack_enqueue=[]
        self.stack_dequeue=[]
        
    def enqueue(self,item):
        self.stack_enqueue.append(item)
        
    def dequeue(self):
        if not self.stack_dequeue:
            if not self.stack_enqueue:
                return "Queue is empty"
            else:
                #Transfer elements from enqueue stack to dequeue stack
                while self.stack_enqueue:
                    self.stack_dequeue.append(self.stack_enqueue.pop())
        return self.stack_dequeue.pop()
    def peek(self):
        if not self.stack_dequeue:
            if not self.stack_enqueue:
                return "Queue is empty"
            
            else:
                # Transfer elements from enqueue stack to dequeue stack
                while self.stack_enqueue:
                    self.stack_dequeue.append(self.stack_enqueue.pop())
        return self.stack_dequeue[-1]
    
    def is_empty(self):
        return not self.stack_enqueue and not self.stack_dequeue
#Example usage:
queue=QueueUsingStacks()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
print(queue.dequeue())
print(queue.peek())
print(queue.dequeue())
