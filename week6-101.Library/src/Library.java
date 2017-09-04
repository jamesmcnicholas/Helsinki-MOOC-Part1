import java.util.ArrayList;

/**
 * Created by James on 02/09/2017.
 */
public class Library {
    private ArrayList<Book> bookList = new ArrayList();

    public Library() {
    }

    public void addBook(Book newBook) {
        bookList.add(newBook);
    }

    public void printBooks() {
        for (Book books : bookList) {
            System.out.println(books);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.bookList) {
            if (StringUtils.included(book.title(),title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.bookList) {
            if (StringUtils.included(book.publisher(),publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<>();
        for(Book book:this.bookList){
            if(book.year()==year){
                found.add(book);
            }
        }
        return found;
    }
}
