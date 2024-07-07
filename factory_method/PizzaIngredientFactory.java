package factory_method;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVerggies();
    public Pepperoni createPeperonie();
    public Clams createClams();
}
