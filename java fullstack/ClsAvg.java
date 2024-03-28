//n=10 --> Find class average mark
import java.io.*;
import java.util.*;
class Student implements Serializable{
  String name;
  int rno;
  float marks;
  Student(String name,int rno,float marks){
    this.name=name;
    this.rno=rno;
    this.marks=marks;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getRno(){
    return rno;
  }
  public void setRno(int rno){
    this.rno=rno;
  }
  public float getmarks(){
    return marks;
  }
  public void setMarks(float marks){
    this.marks=marks;
  }
  public String toString(){
    return name+" "+rno+" "+marks;
  }
} 
class ClsAvg{
  public static void main(String args[]){
  try{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList <Student> students = new ArrayList<>();
    
    for(int i=0;i<n;i++){
    System.out.println("Enter "+(i+1)+" details : ");
    System.out.println("Name: ");
    String name = sc.nextLine();
    
    System.out.println("Roll Number: ");
    int rollNo=sc.nextInt();
    sc.nextLine();

    System.out.println("Marks: ");
    float marks = sc.nextFloat();
    sc.nextLine();

    Student student = new Student(name,rollNo,marks);
    students.add(student);
    }

    //Write data to file
    File f = new File("avg.dat");
    FileOutputStream fos = new FileOutputStream(f);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for (Student student : students){
      oos.writeObject(student);
    }
    oos.close(); 

    float sum=0;
    int count=0;
    //Reading Object from file    
    FileInputStream fis = new FileInputStream(f);
    ObjectInputStream ois = new ObjectInputStream(fis);
    while(true){
      try{
        Student s = (Student) ois.readObject();
        System.out.println(s);
        sum+=s.getmarks();
        count++;
      }
      catch(Exception e){
        break;
      }
    }
    ois.close();
    
    if (count>0){
      float avg = sum/count;
      System.out.println("Class Average Mark: "+avg);
    }
    else
      System.out.println("No students found.");

  }
  catch(Exception e){
    e.printStackTrace();
  }
  }  
}