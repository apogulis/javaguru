package lv.javaguru.demo.lecture2;

public class Book {
        private String author;
        private int yearPublished;
        private String bookName;
        private boolean isNew;
        private long isbn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
class BookValues {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Paulo Coelho ");
        book1.setYearPublished(1988);
        book1.setBookName("The Alchemist ");
        book1.setNew(true);
        book1.setIsbn(9788408052944L);

        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year published: " + book1.getYearPublished());
        System.out.println("Book name: " + book1.getBookName());
        System.out.println("Is the book new? " + book1.isNew());
        System.out.println("ISBN number: " + book1.getIsbn());
    }
}




