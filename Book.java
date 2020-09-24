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
    //2.85
    private int pages; 
    private String refNumber; //2.88

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;//2.85
        refNumber = "";//2.88
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

 * Returns the amount of pages 

 */ 
//2.85
public int getPages() 

{ 

    return pages; 

} 
/** 

 * Sets the refNumber 

 */ 
//2.88
public void setRefNumber(String ref) 

{ //2.90
 if( ref.length() >= 3){ 

        refNumber = ref; 

    } 

    else{ 

        System.out.println("Refnumber must be at least 3 letters"); 
    refNumber = ref; 
}
} 

/** 

 * Returns the refNumber 

 */ 
//2.88
public String getRefNumber() 

{ 

    return refNumber; 

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

 * Prints details of the author, title and pages. 

 */ 
// 2.87
public void printDetails() 

{ 

    System.out.println("Title: " + title); 

    System.out.println("Author: " + author); 

    System.out.println("Pages: " + pages); 
    //2.89
    if(refNumber.length() > 0) { 
        System.out.println("Refnumber = " + refNumber);
       

} 
else{ 
    System.out.println("Refnumber = ZZZ");
    
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
