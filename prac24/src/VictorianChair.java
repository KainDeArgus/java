public class VictorianChair implements Chair {

    public VictorianChair(int age) {
        this.age = age;
    }

    private final int age;

    public int getAge() {
        return age;
    }

    @Override
    public String getType() {
        return "VictorianChair";
    }
}
