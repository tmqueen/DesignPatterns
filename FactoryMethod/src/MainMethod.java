public class MainMethod {
    public static void main(String[] args) {
        Fruit apple = FruitFactory.get("Apple");
        apple.get();
        Fruit banana = FruitFactory.get("Banana");
        banana.get();
    }
}
