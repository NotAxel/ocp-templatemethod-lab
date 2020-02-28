package lab.example.afterrefactoring;

public class MochaCoffee extends  CoffeeClient {
    @Override
    protected void addIngredients() {
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouch()  {
        System.out.println("Add sugar and cream");
    }
}