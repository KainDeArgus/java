class Book implements Printable {
    String name;
    String author;
    int year;

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    }
    static void printBooks(Printable[] printable){
        for (int i = 0;i<printable.length;i++){
            if(printable[i] instanceof Book){
                printable[i].print();
            }
        }
    }
}