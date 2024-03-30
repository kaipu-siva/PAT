import java.util.Queue;
import java.util.LinkedList;
class QMain{
	public static void main(String args[]){
		Queue<Integer> n=new LinkedList<>();
		n.offer(1);
		n.offer(2);
		n.offer(3);
		System.out.println("Queue:"+n);
		int a=n.peek();
		System.out.println("Accessed Element:"+a);
		int r=n.poll();
		System.out.println("removed number:"+r);
		System.out.println("FinalQueue:"+n);
	}
}