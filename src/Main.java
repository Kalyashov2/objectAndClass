public class Main {

    public static void main(String[] args) {

        Book book = new Book("Лев Николавевич Толстой", "Война и мир", 1728);
        Author authorInformation = new Author("Лев", "Толстой");
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.bookName = " + book.getBookName());
        System.out.println("book.yearPublication = " + book.getYearPublication());
        book.setYearPublication(1900);
        System.out.println("book.getYearPublication() = " + book.getYearPublication());
        System.out.println("authorInformation.surname = " + authorInformation.getSurname());
        System.out.println("authorInformation.name = " + authorInformation.getName());


    }
}