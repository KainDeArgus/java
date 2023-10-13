public class MagicChair implements Chair{
    @Override
    public String getType() {
        return "MagicChair";
    }
    public void doMagic(){
        System.out.println("THIS IS MAGIC");
        System.out.println(0/0);
    }
}
