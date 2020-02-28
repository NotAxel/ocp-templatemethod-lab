package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeTemplate;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate mocha = new MochaCoffee();
        CoffeeTemplate cappuccino = new CappuccinoCoffee();
        CoffeeTemplate americano = new AmericanoCoffee();
        mocha.prepareCoffee();

        System.out.println("********************");
        cappuccino.prepareCoffee();
        System.out.println("********************");
        americano.prepareCoffee();


    }

}
