package factory_method;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheessePizza();
        }
        else{
            return null;
        }
    }
    
    
}
