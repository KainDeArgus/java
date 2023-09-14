public class Main {
    public enum Seasons{
        Spring(20){
            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        }, Summer(27){
            @Override
            public String getDescription() {
                return "Теплое время года";
            }

            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        }, Fall(15){
            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        }, Winter(-10){
            @Override
            public String toString() {
                return this.name() + " " + this.getTemp() + " " + getDescription();
            }
        };
        private int temp;
        private Seasons(int temp){
            this.temp = temp;
        }
        public String getDescription(){
            return "Холодное время года";
        }
        public int getTemp() {
            return temp;
        }
    }
    public static void Seas(Seasons seasons){
        switch (seasons){
            case Fall -> System.out.println("I love Fall");
            case Spring -> System.out.println("I hate Spring");
            case Summer -> System.out.println("I'm ok with Summer");
            case Winter -> System.out.println("I more love than hate Winter");
        }
    }
    public static void main(String[] args) {
        String favorite = "Fall";
        System.out.println("Осень - частыне дожди и пасмурная погода");
        for (Seasons seas: Seasons.values()){
            System.out.println(seas);
        }
    }
}