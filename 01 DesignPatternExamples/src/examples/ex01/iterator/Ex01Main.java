package examples.ex01.iterator;

import java.util.Iterator;

public class Ex01Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("AAA"));
        bookShelf.appendBook(new Book("BBB"));
        bookShelf.appendBook(new Book("CCC"));
        bookShelf.appendBook(new Book("DDD"));
        bookShelf.appendBook(new Book("EEE"));
        bookShelf.appendBook(new Book("FFF"));
        bookShelf.appendBook(new Book("GGG"));
        bookShelf.appendBook(new Book("HHH"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
