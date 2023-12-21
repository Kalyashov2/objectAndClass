public class Book {
    private String author;
    private String bookName;
    private int yearPublication;

    public Book(String author, String bookName, int yearPublication){
        this.bookName = bookName;
        this.author = author;
        this.yearPublication = yearPublication;

    }

    public String getAuthor() {
        return this.author;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getYearPublication(){
    return this.yearPublication;
    }
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;

    }



}

