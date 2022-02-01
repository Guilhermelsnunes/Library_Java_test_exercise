import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount() {
        return collection.size();
    }

    public void AddBookToCollection(Book book) {
        this.collection.add(book);
    }




}
