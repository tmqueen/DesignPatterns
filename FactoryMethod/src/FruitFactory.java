public  class  FruitFactory {
    public static Fruit get(String type){
        if(type.equalsIgnoreCase("apple")){
            return new Apple();
        }else if(type.equalsIgnoreCase("banana")){
            return new Banana();
        }else {
            System.out.println("不存在您想要创建的水果类型");
            return null;
        }
    }
}


//注意：判断字符串是否相等使用type.equalsIgnoreCase，而非"=="