public class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(891430, "Samsung A5");
        Phone phone3 = new Phone(881430, "Samsung A8", 63);
        System.out.println(phone3.getNumber());
        phone1.receiveCall("Jhon");
        phone2.receiveCall("John", 9493);
        phone3.sendMessage(1278,1256,1236,2323,2354,5578);
    }
}