package model;

import java.util.ArrayList;
import java.util.List;
public class Authors {
    private int id;
    private String name;
    private List<Books> books;

    public Authors(int id, String name) {
        this.id = id;
        this.name = name;
        books = new ArrayList<Books>();
    }

    public Authors() {
        books = new ArrayList<Books>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(Books book) {
        books.add(book);
        book.setAuthor(this);
    }
}
