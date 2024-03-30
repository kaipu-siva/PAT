import java.util.*;
public class Queueclass{
	static int menu(){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("2.Remove");
		System.out.println("3.Count");
		System.out.println("4.Show all");
		System.out.println("5.Quit");
		System.out.println("Enter choice : ");
		int ch;
		ch=sc.nextInt();
		return ch;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num,ch=0;
		Queue<Integer> n = new LinkedList<>();
		while(ch!=5){
			ch=menu();
			switch(ch){
				case 1:
					System.out.println("Enter num :");
					num=sc.nextInt();
					n.add(num);
					System.out.println("Numbers add : ");
					break;
				case 2:
					try{
						num=n.poll();
						System.out.println("removed number : "+num);
					}
					catch(Exception e){
						System.out.println("No element");
					}
					break;
				case 3:
					System.out.println("count:"+n.size());
					break;
				case 4:
					System.out.println(n);
					break;
				case 5:
					break;
				default :
					System.out.println("wrong choice");
			}
		}
	}
}
				
				