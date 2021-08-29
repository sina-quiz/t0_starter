package ir.ac.kntu;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class SolutionTest {

    Costumer costumer;

    private static Bank bank;

    @BeforeClass
    public static void construct(){
        bank = new Bank();
    }

    @Test
    public void Check(){
        Costumer costumer = new Costumer(1000,2000);
        bank.payWithCash(costumer,300);
        bank.payWithCredit(costumer,500);

    }

    @Test
    public void Check2(){
        Costumer costumer = new Costumer(4500,3000);
        Boolean first = bank.payWithCash(costumer,3000);
        Boolean second = bank.payWithCredit(costumer,1000);
        assertTrue(first);
        assertTrue(second);
        assertEquals(costumer.getCreditCard(),4000);
        assertEquals(costumer.getCash(),0);
        assertEquals(costumer.getTotal(),4000);
    }

    @Test
    public void Check3(){
        Costumer costumer = new Costumer(1000,3200);
        Boolean first = bank.payWithCash(costumer,4000);
        Boolean second = bank.payWithCredit(costumer,800);
        assertFalse(first);
        assertTrue(second);
        assertEquals(costumer.getCreditCard(),600);
        assertEquals(costumer.getCash(),3200);
        assertEquals(costumer.getTotal(),3800);
    }

    @Test
    public void Check4(){
        Costumer costumer = new Costumer(200,200);
        Boolean first = bank.payWithCash(costumer,300);
        Boolean second = bank.payWithCredit(costumer,500);
        assertFalse(first);
        assertFalse(second);
        assertEquals(costumer.getCreditCard(),200);
        assertEquals(costumer.getCash(),200);
        assertEquals(costumer.getTotal(),400);
    }


    @Test
    public void encapsulationCostumerTest() throws IllegalAccessException {
        Costumer costumer = new Costumer(1,1);
        Class<?> address = costumer.getClass();
        Field[] fields = address.getDeclaredFields();
        for (Field field : fields) {
            assertEquals(2, field.getModifiers());
        }
    }



}
