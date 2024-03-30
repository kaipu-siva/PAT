import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++){
			int j=sc.nextInt();
			arr.add(j);
		}
		Arrays.sort(arr);
		System.out.println("minimum :"+arr.get(0));
		System.out.println("maximum :"+arr.get(n));
		int sum = numbers.stream().reduce(0, Integer::sum);
		int avg=sum/n;
		System.out.println("average :" +avg);
	}
}