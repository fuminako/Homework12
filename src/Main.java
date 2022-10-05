public class Main {
    public static void main(String[] args) {
        Author georgeOrwell = new Author("Джордж", "Оруэлл");
        Author georgeMartin = new Author("Джордж", "Мартин");
        Book eightyFour = new Book(georgeOrwell, "1984", 2014);
        Book songOfIceAndFire = new Book(georgeMartin, "Песнь Льда и Огня", 1996);
        songOfIceAndFire.setPublishingYear(2018);

        Book[] book = new Book[5];
        book[0] = eightyFour;
        boolean shelfSpace = false;
        for(int i = 0; i<book.length; i++) {
            if (book[i] == null) {
                shelfSpace = true;
                book[i] = songOfIceAndFire;
                break;
            }
        }
        if (!shelfSpace) {
            System.out.println("Места больше нет");
        }
        for (int i = 0; i<book.length; i++) {
            if (book[i] != null) {
                System.out.println(book[i]);
            }
        }

        System.out.println(georgeMartin.equals(georgeOrwell));
    }
}