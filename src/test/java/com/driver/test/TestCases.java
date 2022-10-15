package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.DeluxePizza;
import com.driver.Pizza;

public class TestCases {

    @Test
    public final void testprintHelloWorld() {
        Pizza p = new Pizza(true);
        p.addExtraToppings();
        p.addTakeaway();
        assertEquals( 390, p.getPrice());
    }

    @Test
    public final void testprintHelloWorld2() {
        Pizza p = new Pizza(false);
        p.addExtraCheese();
        p.addTakeaway();
        assertEquals( 500, p.getPrice());
    }

    @Test
    public final void testprintHelloWorld3() {
        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        assertEquals( "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings Added: 70\nPaperbag Added: 20\nTotal Price: 470\n", p.getBill());
    }

    @Test
    public final void testprintHelloWorld4() {
        DeluxePizza p = new DeluxePizza(false);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addExtraToppings();
        p.addExtraCheese();
        p.getBill();
        p.getBill();
        assertEquals( "Base Price Of The Pizza: 400\nExtra Cheese Added: 80\nExtra Toppings Added: 120\nTotal Price: 600\n", p.getBill());
    }

    @Test
    public final void testprintHelloWorld5() {
        DeluxePizza p = new DeluxePizza(true);
        p.getBill();
        p.getBill();
        assertEquals( "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings Added: 70\nTotal Price: 450\n", p.getBill());
    }
}

