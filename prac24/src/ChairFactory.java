public class ChairFactory implements AbstractFactoryChair{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(10);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
