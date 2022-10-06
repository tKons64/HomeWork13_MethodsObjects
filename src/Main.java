public class Main {
    public static void main(String[] args) {
        //task1();
        task2();

    }

    public static void printBook(Book book) {
        System.out.println("======================");
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Год публикации: " + book.getPublicationYear());
        System.out.println("Автор: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("======================");
    }

    public static void task1() {
        System.out.println("");
        System.out.println("Задание №1. Базовый уровень");

        Author pushkin = new Author("Александр", "Пушкин");
        Author dostoevsky = new Author("Федор", "Достоевский");

        Book dubrovsky = new Book("Дубровский", 1841, pushkin);
        Book igrok = new Book("Игрок", 1865, dostoevsky);

        printBook(dubrovsky);
        printBook(igrok);

        igrok.setPublicationYear(1866);

        printBook(igrok);
    }

    public static boolean insertBookInArray(Book[] arrBooks, Book addBook) {
        boolean bookAdd = false;

        for (int i = 0; i < arrBooks.length; i++) {
            if (arrBooks[i] == null) {
                arrBooks[i] = addBook;
                bookAdd = true;
                break;
            }
        }

        return bookAdd;
    }

    public static void printBook2(Book[] arrBooks) {
        for (int i = 0; i < arrBooks.length; i++) {
            if (arrBooks[i] == null) {
                continue;
            }
            System.out.println(arrBooks[i].toString());
        }
    }

    public static void task2() {
        System.out.println("");
        System.out.println("Задание №1. Базовый уровень");

        Book[] arrayBook = new Book[5];

        Author pushkin = new Author("Александр", "Пушкин");
        Author dostoevsky = new Author("Федор", "Достоевский");
        Author tolstoy = new Author("Лев", "Толстой");

        Book dubrovsky = new Book("Дубровский", 1841, pushkin);
        Book igrok = new Book("Игрок", 1865, dostoevsky);
        Book voynaMir = new Book("Война и мир", 1865, tolstoy);

        if (insertBookInArray(arrayBook, dubrovsky) == false) {
            System.out.println("В массиве нет свободного места!");
        }else if (insertBookInArray(arrayBook, igrok) == false){
            System.out.println("В массиве нет свободного места!");
        } else if (insertBookInArray(arrayBook, voynaMir) == false) {
            System.out.println("В массиве нет свободного места!");
        }

        printBook2(arrayBook);

        System.out.println("==========================");

        System.out.println("dostoevsky.equals(dostoevsky) = " + dostoevsky.equals(dostoevsky));
        System.out.println("dostoevsky.equals(pushkin) = " + dostoevsky.equals(pushkin));

        System.out.println("==========================");

        System.out.println("dostoevsky.hashCode() = " + dostoevsky.hashCode());

        System.out.println("==========================");

        System.out.println("dubrovsky.equals(dubrovsky) = " + dubrovsky.equals(dubrovsky));
        System.out.println("dubrovsky.equals(igrok) = " + dubrovsky.equals(igrok));
        System.out.println("==========================");
        System.out.println("dubrovsky.hashCode() = " + dubrovsky.hashCode());

    }

}