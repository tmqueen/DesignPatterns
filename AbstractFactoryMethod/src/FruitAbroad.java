public class FruitAbroad implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SheguoApple();
    }

    @Override
    public Fruit getBanana() {
        return new PhilipineBanana();
    }
}
