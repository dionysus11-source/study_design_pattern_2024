package factory_method;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        	if (item.equals("cheese")) {
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("시카고 스타일 치즈 피자");
        	} else if (item.equals("clam")) {
            	pizza = new ClamPizza(ingredientFactory);
				pizza.setName("시카고 스타일 조개 피자");
        	} else return null;
		return pizza;
	}
}
