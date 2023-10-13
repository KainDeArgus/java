public class ShopChair {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();
        VictorianChair victorianChair = chairFactory.createVictorianChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        MagicChair magicChair = chairFactory.createMagicChair();
        System.out.println(victorianChair.getAge());
        client.setChair(victorianChair);
        client.sit();
        System.out.println(functionalChair.sum(20,67));
        client.setChair(functionalChair);
        client.sit();
        magicChair.doMagic();
    }
}