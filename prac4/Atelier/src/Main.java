public class Main {
    public static void main(String[] args) {
        enum Size {
            XXS(32) {
                @Override
                public String getDescription() {
                    return "Детский размер";
                }
            }, XS(34), S(36), M(38), L(40);
            public final int euroSize;

            Size(int euroSize) {
                this.euroSize = euroSize;
            }

            public String getDescription() {
                return "Взрослый размер";
            }
        }

        interface ManClothing {
            void dressMan();
        }

        interface WomenClothing {
            void dressWomen();
        }

        abstract class Clothes {
            public double cost;
            public String color;
            public Size size;

            Clothes(double cost, String color, Size size) {
                this.cost = cost;
                this.color = color;
                this.size = size;
            }
            public void dressMan(){}
            public void dressWomen(){}
        }

        class TShirt extends Clothes implements ManClothing, WomenClothing {
            TShirt(double cost, String color, Size size) {
                super(cost, color, size);
            }

            @Override
            public void dressMan() {
                System.out.println("Мужчина надел футболку размера " + size.euroSize + " ценой " + cost + " и цветом " + color);
                System.out.println(size.getDescription() + " " + size.name());
            }

            @Override
            public void dressWomen() {
                System.out.println("Женщина надела футболку размера " + size.euroSize + " ценой " + cost + " и цветом " + color);
                System.out.println(size.getDescription() + " " + size.name());
            }
        }

        class Pants extends Clothes implements ManClothing, WomenClothing {
            Pants(double cost, String color, Size size) {
                super(cost, color, size);
            }

            @Override
            public void dressMan() {
                System.out.println("Мужчина надел штаны размера " + size.euroSize + " ценой " + cost + " и цветом " + color);
                System.out.println(size.getDescription() + " " + size.name());
            }

            @Override
            public void dressWomen() {
                System.out.println("Женщина надела штаны размера " + size.euroSize + " ценой " + cost + " и цветом " + color);
                System.out.println(size.getDescription() + " " + size.name());
            }
        }

        class Skirt extends Clothes implements WomenClothing {
            Skirt(double cost, String color, Size size) {
                super(cost, color, size);
            }

            @Override
            public void dressWomen() {
                System.out.println("Женщина надела юбку размера " + size.euroSize + " ценой " + cost + " и цветом " + color);
                System.out.println(size.getDescription() + " " + size.name());
            }
        }

        class Tie extends Clothes implements ManClothing {
            Tie(double cost, String color, Size size) {
                super(cost, color, size);
            }

            @Override
            public void dressMan() {
                System.out.println("Мужчина надел галстук размера " + size.euroSize + " ценой " + cost + " и цветом " + color);
                System.out.println(size.getDescription() + " " + size.name());
            }
        }
        class Atelier {

            public void dressMan(Clothes[] clothes) {
                for (int i = 0; i < clothes.length; i++) {
                    clothes[i].dressMan();
                }
            }

            public void dressWomen(Clothes[] clothes) {
                for (int i = 0; i < clothes.length; i++) {
                    clothes[i].dressWomen();
                }
            }
        }

        Tie tie = new Tie(123, "red", Size.L);
        TShirt tShirt = new TShirt(850, "white", Size.XXS);
        Pants pants = new Pants(910, "black", Size.S);
        Skirt skirt = new Skirt(1340, "blue", Size.M);
        Clothes[] clothes = {tie, tShirt, pants, skirt};
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWomen(clothes);
    }
}