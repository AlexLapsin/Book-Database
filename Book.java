//Alexandru Lapsin CISC 3130
//Homework 4 part I

import java.util.*;

public class Book implements Comparable<Book>{

   //declaring instance variables
   private String title;
   private String publisher;
   private int yearPub;
   private int numAuthors;
   private HashSet<String> authorsS;
   
   //constructor
   public Book (String title, String publisher, int yearPub, String[] authors, int numAuthors) {
      this.title = title;
      this.publisher = publisher;
      this.yearPub = yearPub;
      this.numAuthors = numAuthors;
      this.authorsS = new HashSet<String>();
      
      for(int i = 0; i < authors.length; i++)//populating the hashset with the values from array authors
         authorsS.add(authors[i]);
   }       
  
   
   //Getters
	public String getTitle() {return title;}

	public String getPublisher() {return publisher;}

	public int getYearPub() {return yearPub;}
   
	public int getNumAuthors() {return numAuthors;}
   
	public HashSet<String> getAuthorsS() {return authorsS;}
   
  
   //equals
   public boolean equals(Object obj){
      if(!(obj instanceof Book))
         return false;
      Book another = (Book)obj;
         
      return another.getTitle().equals(this.title);//assuming that both books are the same their titles are similar
   }   
      
   //compare to
   public int compareTo(Book another) {
   
      return another.title.compareTo(this.title);
   }
   
   //to String      
   public String toString(){
      
      StringBuilder sb = new StringBuilder("\n******************************");
      
      sb.append("\nTitle: " + title);
      sb.append("\nAuthors: "+ authorsS);
      sb.append("\nPublisher: "+ publisher);
      sb.append("\nYear :" + yearPub);
      sb.append("\n******************************\n");
      
   return sb.toString();
   }

}//closing class      