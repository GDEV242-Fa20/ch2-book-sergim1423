/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Sergi Manolov
 * @version September 23 2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
/** 

 * Returns the name of the author 

 */ 
//2.83 
public String getAuthor() 

{ 

    return author; 

} 

/** 

 * Returns the title of the book 

 */ 
//2.83
public String getTitle() 
{
    return title; 
}

 /** 

 * Prints the name of the author 

 */ 
//2.84
public void printAuthor() 

{ 

    System.out.println(author); 

} 

/** 

 * Prints the title of the book 

 */ 

public void printTitle() 
//2.84
{ 

    System.out.println(title); 

} 

    /**
     * Provide access to the string holding the author's name
     * @return author
     */
    //public String getAuthor()
    {
   //     return author;
   }
    
        /**
     * Provide access to the string holding the book's title
     * @return title
     */
    //public String getTitle()
    {
     //   return title;
    }
    
    
    
    
    
}
