/*
 * The example code is adopted from the following site:
 * http://www.codeproject.com/Articles/184765/Factory-Method-Design-Pattern
 */

public class Main {

    public static void main(String[] args) {
        System.out.print("East Coast Customer: ");
        BookStore bookstore = new BookStoreEastCoast();
        bookstore.newDistributor();
        bookstore.getDistributor().shipBook();

        System.out.print("Mid West Customer: ");
        bookstore = new BookStoreMidWest();
        bookstore.newDistributor();
        bookstore.getDistributor().shipBook();

        System.out.print("West Coast Customer: ");
        bookstore = new BookStoreWestCoast();
        bookstore.newDistributor();
        bookstore.getDistributor().shipBook();

    }
}
