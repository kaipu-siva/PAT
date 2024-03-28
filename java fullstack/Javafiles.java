import java.io.File;
public class Javafiles{
	static int menu(){
		Scanner sc=new Scanner(System.in);
		System.out.println("1. show java file");
		System.out.println("2. Delete File");
		System.out.println("3. rename file");
		System.out.println("4. quit");
		System.out.println("enter choice:");
		
	}
	public static void main(String[] args){
		int jctr=0,tctr=0,dctr=0;
		File mydir=new File(".");
		File[] filesInDirectory = mydir.listFiles();
		for(File f:filesInDirectory)
		{
			String fn;
			fn=f.getName();
			if(fn.endsWith(".java")){
				System.out.println(fn);
				jctr++;
			}
			else if(fn.endsWith(".txt")){
				System.out.println(fn);
				tctr++;
			}
			else{
				System.out.println(fn);
				dctr++;
			}
		}
		System.out.println("No of java files :"+jctr);
		System.out.println("No of text files :"+tctr);
		System.out.println("No of other files :"+dctr);
	}
}
