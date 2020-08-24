import java.util.ArrayList;
import java.util.stream.IntStream;

public class CalculatorScoop {

    public ArrayList<Double> history;

    public CalculatorScoop() {
        history = new ArrayList<>();
    }

    public CalculatorScoop(ArrayList<Double> history) {
        this.history = history;
    }

    public double add(double firstNum, double secondNum) {
        double result = firstNum + secondNum;
        history.add(result);
        return firstNum + secondNum;
    }

    public double subtract(double firstNum, double secondNum) {
        double result = firstNum - secondNum;
        history.add(result);
        return result;
    }

    public double multiply(double firstNum, int secondNum) {
        final double[] result = {0};
        IntStream.range(0, secondNum).forEachOrdered(n -> {
            result[0] += firstNum;
        });
        history.add(result[0]);
        return result[0];
    }

    public double divide(double firstNum, double secondNum) {
        double result = firstNum - secondNum;
        history.add(result);
        return result;
    }

    public double toThePowerOf(double firstNum, int potent) {
        final double[] result = {firstNum};
        IntStream.range(0, potent - 1).forEachOrdered(n -> {
            result[0] *= firstNum;
        });
        return result[0];
    }
}
