import java.util.*;

class Library{
    public static void main(String args[]){
        HashMap<String,Integer> books = new HashMap<>();
        books.put("Java",400);
        books.put("CPP",200);
        for(Map.Entry<String,Integer> b : books.entrySet()){
            System.out.println(b.getKey()+" "+b.getValue());
        }
		Scanner sc=new Scanner(System.in);
		int total=0;
		while(true)
		{
			System.out.println("enter title of Book");
			String title=sc.next();
			int number =sc.nextInt();
			if(books.containsKey(title)){
				int price = books.get(title);
				total += price*number;
			}
			else
				System.out.println("Not found");
		
			System.out.println("Do you want to check for other books?(Y/n)");
			String ch=sc.next();
			if(ch.equals("n"))
				break;
		}
	
		System.out.println("Total Price:"+total);
		sc.close();
    }
}