/* write a program to find the total cost of library. The library maintain set of books. Every book has title and price. */

import java.util.*;
class Book
{
  String title;
  int price;
  Book(String title, int price)
  {
      this.title=title;
      this.price=price;
  }
  public String getTitle()
  {
    return title;
  }
  public void setTitle(String title)
  {
    this.title=title;
  }
  public int getPrice()
  {
    return price;
  }
  public void getPrice(int price)
  {
    this.price=price;
  }
  public String toString()
  {
    return title + " " + price;
  }
  
}
class Library
{
  ArrayList<Book> lib;
  Library()
  {
    lib = new ArrayList<>();
  }
  void addBook(Book b)
  {
    lib.add(b);
  }
  void removeBook(int b)
  {
    lib.remove(b);
  }
  void showBooks()
  {
    for(Book b: lib)
    {
      System.out.println(b.getTitle() + " " + b.getPrice());
    }
  }
  void showBookTitle()
  {
    for(Book b: lib)
    {
      System.out.println(b.getTitle());
    }
  }
  void calbill()
  {
    int tot=0;
    for (Book b: lib)
    {
      tot+=b.getPrice();
    }
    System.out.println("Total Books Price is " + tot);
  }
}
class College1
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Book b;
    Library lib = new Library();
    while(true)
    {
      System.out.print("Enter the book name : ");
      String bn = sc.next();
      System.out.print("Enter price for book " + bn + " : " );
      int bp = sc.nextInt();
      b = new Book(bn,bp);
      lib.addBook(b);
      int i=0;
      while(true)
      {
        System.out.println("1. Add books" + "\n" + "2. Book details " + "\n" + "3. Total price " + "\n" + "4. Press anyother other number to end ");
        int ch = sc.nextInt();
        if (ch==1)
        {
          break;
        }
        else if (ch==2)
        {
          lib.showBooks();
          continue;
        }
        else if (ch==3)
        {
          lib.calbill();
          
        }
        else
        {
          i=1;
          break;
        }
        
      }
      if (i==1)
      {
          break;
      }
      
    }
    
  }
}