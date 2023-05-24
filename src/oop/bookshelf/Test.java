package oop.bookshelf;

public class Test {

    public static void main(String[] args) {

        Book book1 = new Book(1,"j k rowling", "haary potter", 556);
        Book book2 = new Book(2, "Christopher Paolini", "Eragon", 509);
        Book book3 = new Book(3, "dan brown", "the da Vinci coDe", 1532);

        Shelf.addBook(book1);
        Shelf.addBook(book2);
        Shelf.addBook(book3);

        System.out.println(Shelf.getTheBooks().get(0));
        System.out.println(Shelf.findBookByPartialTitle("code"));

    }
}
