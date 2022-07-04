package examples.ex01.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Aggregate{
    private List<Book> books;
    private int last = 0;

    public BookShelf (){
        this.books = new ArrayList<Book>();
    }
    public Book getBookAt(int idx){
        return books.get(idx);
    }
    public void appendBook(Book book){
        this.books.add(book);
    }

    public int getLength(){
        return this.books.size();
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
