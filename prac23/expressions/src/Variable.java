public class Variable {
    private final String name;
    private final int pow;

    public Variable(String name){
        this.name = name;
        pow = 1;
    }

    public Variable(String name, int pow) {
        this.name = name;
        this.pow = pow;
    }

    public Const toConst(double v){
        return new Const(Math.pow(v, pow));
    }
}