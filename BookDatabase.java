import java.util.*;

public class BookDatabase{

   private Map<String, Book> bookData; //declaring a reference to a map
   
   //Constructor
   public BookDatabase(){
      this.bookData = new HashMap<String, Book>();
   } 
   
   //Search by the title
   public Book searchByTitle(String title){
       for(String t: bookData.keySet())//since our title is the key, iterate trough the key set and
        { 
         if(title==t)      //compare the given title with every title from the database(keyset)
            return bookData.get(t); //if the title is found, return the coresponding book
        }
     return null;//else return a sentinel value     
   }
   
   //Search by author
   public Set<Book> searchByAuthor(String author){
        HashSet<Book> set = new HashSet<Book>(); //declare an empty hash set
        
        for(Book b : bookData.values()){ //iterate trough the books(values) in the database
            
            if(b.getAuthorsS().contains(author))//and see if that book has this author
               set.add(b);//if the author is found, add the coresponding book to the hash set then
            }
         return set;//return it
   }
   
   
   //Books published before a given year
   public Set<Book> publishedBefore(int year){
         Set<Book> set = new HashSet<Book>();//create a new hash set
         
         for(Book b : bookData.values()){//and check trough the books in database
            
            if(b.getYearPub() < year)//if the published year is lower then the given year
               set.add(b);//add it to the new hash set and
            }
         return set;//return the set
   }
   
   
   //searching by publisher
   public Set<Book> searchByPublisher(String publisher){
          Set<Book> set = new HashSet<Book>();
               
          for(Book b : bookData.values()){
                  
              if(b.getPublisher() == publisher)
                     set.add(b);
          }
       return set;
   }
   
   
   //adding a new book
   public void addBook(Book book){
       if(!(bookData.containsValue(book))) //if the book is not there
          bookData.put(book.getTitle(), book);//add it to the database
       else
         System.out.println("The book is already in the Database");//else let the user know 
    }
   
   
   //removing a book from database
   public void removeBook(String title){
   
       if(bookData.containsKey(title))//if the book title is in the database
          bookData.remove(title);//remove the book with given title
       else
         System.out.println("The book with this title is not in the Database");//else let the user know
   
   }

   
   //to String
   public String toString(){
      
      StringBuilder sb = new StringBuilder("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
      
      for(Book b: bookData.values()){
         sb.append(b);
         sb.append("\n");
      }      
      
      sb.append("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
      
      return sb.toString();
   }

} //closing class     
