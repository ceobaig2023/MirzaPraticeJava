package Overriding;

public class Mango extends Fruit{

    @Override
    public void fruitFlavour(){
        System.out.println("Mango Flavour");
    }

   /* public void userFruit(int quantity,String name){
        System.out.println("Quantity is "+quantity+"Name :="+name);
    }*/
}
