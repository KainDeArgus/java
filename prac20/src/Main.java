public class Main {
    public static void main(String[] args) {
        JenerikClass<Integer,String,Double> jenerikClass = new JenerikClass<>(20, "approksimaciya", 1.5);
        jenerikClass.outputClassName();
    }
}