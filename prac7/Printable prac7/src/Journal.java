public class Journal implements Printable {
    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    public void print() {

        System.out.printf("Журнал '%s'\n", name);
    }

    static void printMagazines(Printable[] printable){
        for (int i = 0;i<printable.length;i++){
            if(printable[i] instanceof Journal){
                printable[i].print();
            }
        }
    }
}