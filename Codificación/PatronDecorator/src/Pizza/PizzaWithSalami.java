/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

/**
 *
 * @author Rocio
 */
public class PizzaWithSalami extends PizzaWithTopping{

    public PizzaWithSalami(Pizza pizza) {
        this.pizza=pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription()+", extra salami";
    }
    
}
