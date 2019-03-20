import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;

    }

    public int countBooks() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if(this.countBooks() < this.capacity){
            this.collection.add(book);
        }
    }
}
