public class Phone {
    public int number;
    public String model;
    public int weight;
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }
    public Phone(int number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Calling " + name);
    };
    public void receiveCall(String name, int number){
        System.out.println("Calling " + name + " " + number);
    };
    public int getNumber(){
        return this.number;
    }
    public void sendMessage(int... numbers){
        for (int x: numbers){
            System.out.println(x);
        }
    }
}