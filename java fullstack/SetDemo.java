import java.util.*;
class SetDemo{
	public static void main(String args[])
	{
		HashSet<Integer> hs=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter numbers : ");
			int n=sc.nextInt();
			hs.add(n);
			System.out.println("Continue (y/n) : ");
			char ch=sc.next().charAt(0);
			if(ch=='n')
				break;
		}
		TreeSet<Integer> ts=new TreeSet(hs);
		System.out.println("set of numbers(hs)"+hs);
		System.out.println("set of numbers(ts)"+ts);
		System.out.println("set of numbers (ts desc)"+ts.descendingSet());
		Iterator itr=ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		int total=0;
		while(itr.hasNext()){
			int element=((Integer)itr.next()).intValue();
			System.out.println(element);
			total=total+element;
		}
		System.out.println("Sum"+total);
		int average=0;
		average=total/ts.size();
	}
}
