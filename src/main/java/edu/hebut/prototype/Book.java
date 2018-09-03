package edu.hebut.prototype;

/**
 * 浅拷贝
 */
public class Book  implements Cloneable{
    private String bookName;
    private int price;
    private Author author;

    @Override
    public Book clone() {
        Book book=null;
        try {
            book=(Book)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return book;

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
