class KQueuesInArray:
    def init(self,k,n):
        self.k=k #Number of queues
        self.n=n #Total size of the array
        self.queue=[0]*n #Initialize array to store queue elements
        self.front=[-1]*k #Initialize array to store front indices of queue 
        self.rear=[-1]*k #Initialize array to store rear indices of queue
        self.next_index=list(range(1,n))+[-1] # Initialize array to store
        self.next_available=0 #Index of next available position in the array
        
    def is_empty(self,qn):
        return self.front[qn]==-1
    
    def is_full(self):
        return self.next_available==-1
    
    def enqueue(self,item,qn):
        if self.is_full():
            print("Queue overflow")
            return
        
        new_index=self.next_available
        self.next_available=self.next_index[new_index]
        
        if self.is_empty(qn):
            self.front[qn]=new_index
        else:
            self.next_index[self.rear[qn]]=new_index
        
        self.next_index[new_index]=-1
        self.queue[new_index]=item
        self.rear[qn]=new_index

    def dequeue(self,qn):
        if self.is_empty(qn):
            print("Queue underflow")
            return None
        
        front_index=self.front[qn]
        item=self.queue[front_index]
        
        self.front[qn]=self.next_index[front_index]
        self.next_index[front_index]=self.next_available
        self.next_available=front_index
        
        return item
    
#Example Usage:
k_queues=KQueuesInArray(3,10) #Create 3 queues in a single array of size 10
k_queues.enqueue(1,0) #Enqueue 1 into queue 0
k_queues.enqueue(2,1) #Enqueue 2 into queue 1
k_queues.enqueue(3,2) #Enqueue 3 into queue 2
print(k_queues.dequeue(0))
