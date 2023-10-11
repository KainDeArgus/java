import java.io.Serializable;

public class JenerikClass<T extends Number, V extends Serializable, K> {
    T tParam;
    V vParam;
    K kParam;
    public T gettParam() {
        return tParam;
    }

    public V getvParam() {
        return vParam;
    }

    public K getkParam() {
        return kParam;
    }

    public JenerikClass(T tParam, V vParam, K kParam) {
        this.tParam = tParam;
        this.vParam = vParam;
        this.kParam = kParam;
    }

    public void outputClassName(){
        System.out.println(tParam + " (" + tParam.getClass() + ")");
        System.out.println(vParam + " (" + vParam.getClass() + ")");
        System.out.println(kParam + " (" + kParam.getClass() + ")");
    }
}
