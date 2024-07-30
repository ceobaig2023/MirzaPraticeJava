package Overriding;

public class Fruit {

    public void fruitFlavour(){
        System.out.println("Any Flavour");
    }
    public void userFruit(String name){
      //  this.name=name;
        System.out.println("THIS is "+name);
    }
    public void userFruit(int quantity,String name){
        System.out.println("Quantity is "+quantity+"Name :="+name);
    }
}
