//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Юлия", "Вереск");
        Author author2 = new Author("Микита", "Франко");
        Author author3 = new Author("Лев", "Толстой");

        Book book1 = new Book("Тот самый", author1, 2020);
        Book book2 = new Book("Девочка в нуливой степени", author2, 2020);
        Book book3 = new Book("Война и мир", author3, 1877);

        System.out.println("Книги до измненения");

        printBookInfo(book1);
        printBookInfo(book2);
        printBookInfo(book3);

        System.out.println("Книги после изменения");
        printBookInfo(book1);
        printBookInfo(book2);
        printBookInfo(book3);
    }

    public static void printBookInfo(Book book) {
        System.out.println("Книга: " + book.getTitle());
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        System.out.println("Год публикации: " + book.getPublicationYear());
        System.out.println();
    }
}