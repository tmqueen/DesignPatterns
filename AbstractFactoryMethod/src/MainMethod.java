public class MainMethod {
    public static void main(String[] args) {
        //采集国外苹果
       FruitAbroad fruitAbroad = new FruitAbroad();
       Fruit apple = fruitAbroad.getApple();
       apple.get();

        //采集国内苹果
        FruitDomestic fruitDomestic = new  FruitDomestic();
       Fruit apple1 = fruitDomestic.getApple();
       apple1.get();

        //采集国外香蕉
        FruitAbroad fruitAbroad1 = new FruitAbroad();
        Fruit banana = fruitAbroad.getBanana();
        banana.get();

        //采集国内香蕉
        FruitDomestic fruitDomestic1 = new  FruitDomestic();
        Fruit banana1 = fruitDomestic.getBanana();
        banana1.get();
    }
}
