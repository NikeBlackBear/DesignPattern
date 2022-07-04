package examples.ex01.iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int idx;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        if(idx < bookShelf.getLength()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(idx);
        idx++;
        return book;
    }

}
