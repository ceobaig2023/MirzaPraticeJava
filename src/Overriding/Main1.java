package Overriding;

public class Main1 {

    public static void main(String[] args) {
        Banana obj=new Banana();
        obj.fruitFlavour();

        Fruit obj1=new Mango();
        obj1.fruitFlavour();

        obj1.userFruit("Apple");
        obj1.userFruit(22,"Grapes");
    }

}
