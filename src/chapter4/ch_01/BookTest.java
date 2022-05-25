package chapter4.ch_01;

class Book{

    private String title;
    private String author;

    @Override
    public String toString() {
        return title + "," + author;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 허세");

        System.out.println(book);

        String str = new String("test");
        System.out.println(str);
    }
}
