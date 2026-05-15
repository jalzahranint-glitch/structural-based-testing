import org.junit.Test;
import static org.junit.Assert.*;
// This class contains unit tests for the VendingMachine system
// covering different payment scenarios and system behavior
public class VendingMachineTest {

    // Tests that the machine correctly dispenses candy when the exact amount is entered
    @Test
    public void testCandyExactMoney() {
        String result = VendingMachine.dispenseItem(20, "candy");
        assertEquals("Item dispensed.", result);
    }


    // Tests that the machine returns change when more money than required is inserted for candy
    @Test
    public void testCandyExcessMoney() {
        String result = VendingMachine.dispenseItem(35, "candy");
        assertTrue(result.contains("change"));
    }

    // Tests that the machine does not dispense candy when the entered amount is insufficient
    @Test
    public void testCandyInsufficientMoney() {
        String result = VendingMachine.dispenseItem(5, "candy");
        assertTrue(result.contains("not dispensed"));
    }

    // Tests that the machine correctly dispenses coke when the exact amount is entered
    @Test
    public void testCokeExactMoney() {
        String result = VendingMachine.dispenseItem(25, "coke");
        assertEquals("Item dispensed.", result);
    }

    // Tests that the machine returns change when more money than required is inserted for coke
    @Test
    public void testCokeExcessMoney() {
        String result = VendingMachine.dispenseItem(40, "coke");
        assertTrue(result.contains("change"));
    }

    // Tests that the machine does not dispense coke when the entered amount is insufficient
    @Test
    public void testCokeInsufficientMoney() {
        String result = VendingMachine.dispenseItem(15, "coke");
        assertTrue(result.contains("not dispensed"));
    }


    // Tests that the machine correctly dispenses coffee when the exact amount is entered
    @Test
    public void testCoffeeExactMoney() {
        String result = VendingMachine.dispenseItem(45, "coffee");
        assertEquals("Item dispensed.", result);
    }

    // Tests that the machine returns change when more money than required is inserted for coffee
    @Test
    public void testCoffeeExcessMoney() {
        String result = VendingMachine.dispenseItem(60, "coffee");
        assertTrue(result.contains("change"));
    }

    // Tests that the machine does not dispense coffee when the entered amount is insufficient
    @Test
    public void testCoffeeInsufficientMoney() {
        String result = VendingMachine.dispenseItem(30, "coffee");
        assertTrue(result.contains("not dispensed"));
    }

    // Tests how the system behaves when zero money is entered
    @Test
    public void testZeroMoney() {
        String result = VendingMachine.dispenseItem(0, "candy");
        assertTrue(result.contains("not dispensed"));
    }

}
