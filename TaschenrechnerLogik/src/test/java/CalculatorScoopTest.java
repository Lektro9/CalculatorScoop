import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.Assert.*;

public class CalculatorScoopTest {

    @Test
    public void addition() {
        CalculatorScoop calc = new CalculatorScoop();
        double result = calc.add(1.0, 1.0);
        Assert.assertEquals(2, result, 0.01);
    }

    @Ignore
    public void subtraction() {
        throw new NotImplementedException();
    }

    @Test
    public void multiply() {
        CalculatorScoop calc = new CalculatorScoop();
        Assert.assertEquals(25, calc.multiply(5, 5), 0.01);
    }

    @Ignore
    public void division() {
        CalculatorScoop calc = new CalculatorScoop();
        Assert.assertEquals(5, calc.add(40, 8), 0.01);
    }

    @Test
    public void toThePowerOf() {
        CalculatorScoop calc = new CalculatorScoop();
        Assert.assertEquals(125, calc.toThePowerOf(5, 3), 0.01);
    }

    @Test
    public void history() {
        CalculatorScoop calc = new CalculatorScoop();
        calc.add(1, 1);
        calc.subtract(5, 4);
        calc.divide(3, 3);
        Assert.assertEquals(3, calc.history.size());
        Assert.assertEquals(2.0, calc.history.get(0), 0.01);
    }
}