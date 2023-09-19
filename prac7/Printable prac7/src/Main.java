public class Main {
    public static void main(String[] args) {
        Printable printable2 = new Book("Война и мир", "Л. Н. Толстой", 1863);
        printable2.print();//для одного объекта
        printable2 = new Journal("Хакер");
        printable2.print();//для другого объекта

        Printable printable =
                createPrintable("Компьютерра", false);
        printable.print();
        read(new Book("Отцы и дети", "И. Тургенев", 1862));
        read(new Journal("Хакер"));

        Printable [] printableArray = {new Book("Капитанская дочка", "А. С. Пушкин", 1800), new Journal("США"), new Journal("Пришельцы"),new Book("Ни много, ни мало градусов по Фаренгейту", "Кон Чен Ый", 2200)};
        Book.printBooks(printableArray);
        Journal.printMagazines(printableArray);
    }

    //статический метод класса
    static void read(Printable p) {
        p.print();
    }

    //статический метод
    static Printable createPrintable(String name, boolean option) {
        if (option)
            return new Book(name, "неизвестен", 2015);
        else
            return new Journal(name);
    }
}