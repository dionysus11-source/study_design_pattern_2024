package factory_method;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVerggies() {
        Veggies[] veggies = {new Spinach(), new BlackOlives(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPeperonie() {
        return  new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
    
}
