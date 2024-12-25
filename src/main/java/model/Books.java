package model;

public class Books {
    private int id;
    private int authorId;
    private String bookTitle;
    private int quantity;
    private Authors author;

    public Books(int id, int authorId, String bookTitle, int quantity) {
        this.id = id;
        this.authorId = authorId;
        this.bookTitle = bookTitle;
        this.quantity = quantity;
    }

    public Books() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }
}
