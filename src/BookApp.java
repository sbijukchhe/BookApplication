import java.util.List;

public class BookApp {

    // method to return the author, title and description.
    public static void getDisplayText(List<Book> books){

        for (Book myBook : books){
            System.out.println();
            System.out.println("Title: " + myBook.getTitle()+ "\t\tAuthor: " + myBook.getAuthor()+
                    "\t\tDescription: " + myBook.getDescription());
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args){

        Book book = new Book();
        BookDatabase bd = new BookDatabase();
        List<Book> myBooks = bd.getBooks();
        getDisplayText(myBooks);
    }
}

