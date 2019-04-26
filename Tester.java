//Alexandru Lapsin CISC 3130
//Homework 4 part III

import java.util.*;

public class Tester {
   
   //MAIN
   public static void main(String[] arg){
      
      
      //Adding DATA
      
      String[] book1Authors = {"Luke Skywalker", "Stephen Richards"};
      String[] book2Authors = {"Stephen Richards", "Chuck Norris"};
      String[] book3Authors = {"Thomas Anderson", "Chuck Norris", "Luke Skywalker"};
      
      Book book1 = new Book("Data Structures", "Brooklyn College", 1999, book1Authors, 2);
      Book book2 = new Book("Discrete Structures", "Pearson", 2009, book2Authors, 2);
      Book book3 = new Book("Algorithms", "Pearson", 2018, book3Authors, 3);
      
      Book[] books = {book1, book2, book3};
      
      
      BookDatabase database = new BookDatabase();//creating a new database
       
       
      //TESTING    
         
      //adding books to book database  
      database.addBook(book1);
      database.addBook(book2);
      database.addBook(book3);
      database.addBook(book3);//testing the entry of the same book   

  
      System.out.println(book1.compareTo(book3));//verifing compareTo
      System.out.println(book1.equals(book2));//verifing equals
      System.out.println("\n\nSearch results by title: \n\n" + database.searchByTitle("Data Structures"));//searching by given title
      System.out.println("\n\nSearch results by publisher: \n\n" + database.searchByPublisher("Pearson"));//searching by publisher
      System.out.println("\n\nSearch results by author: \n\n" + database.searchByAuthor("Luke Skywalker"));//searching by author
      System.out.println("\n\nSearch results by books published before a given year: \n\n" + database.publishedBefore(2015));//getting the books published before a given year
      System.out.println("\n\nToString before calling remove: \n\n" + database.toString());//checking toString
      database.removeBook("Algorithms");//removing a book from database
      System.out.println("\n\nToString after calling remove: \n\n" + database.toString());//Checking toString after removing a book
   
      }//closing main

}//closing class