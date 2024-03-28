import java.util.*;
class Frequency{
	public static void main(String args[]){
		int arr[]={77,66,55,66,33,44,33,22,11};
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(freq.containsKey(arr[i]))
				freq.put(arr[i],freq.get(arr[i])+1);
			else
				freq.put(arr[i],1);
		}
		System.out.println(freq);
	}
}
		