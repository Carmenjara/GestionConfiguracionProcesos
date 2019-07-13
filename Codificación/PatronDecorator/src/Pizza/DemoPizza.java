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
public class DemoPizza {
    public static void main(String[] args) {
//        //Pizza Hawaiian con Extra queso, salsa BBQ y Salami
//        Pizza pizza= new HawaiianPizza();
//        
//        pizza=new PizzaWithExtraCheese(pizza);
//        pizza=new PizzaWithBBQSauce(pizza);
//        pizza= new PizzaWithSalami(pizza);
//        
//        
//        System.out.println(pizza.getDescription());
        
        //Pizza vegetariana con salsa BBQ y salami
        Pizza pizzaV= new VegetarianPizza();
        
        pizzaV=new PizzaWithBBQSauce(pizzaV);
        pizzaV= new PizzaWithSalami(pizzaV);
        
        System.out.println(pizzaV.getDescription());
    }
    
}
