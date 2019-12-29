public class FruitDomestic implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new HongfushiApple();
    }

    @Override
    public Fruit getBanana() {
        return new HainanBanana();
    }
}
