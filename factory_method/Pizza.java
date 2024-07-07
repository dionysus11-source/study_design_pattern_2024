package factory_method;

import java.util.ArrayList;
import java.util.List;

public abstract  class Pizza {
    String name;
    
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    
    abstract void prepare();

    void bake() {
        System.err.println("175도에서 25분간 굽기");
    }
    
    void cut() {
        System.err.println("피자를 사선으로 자르기");
    }
    
    void box() {
        System.err.println("상자에 피자 담기");
    }

    void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
