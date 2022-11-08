public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println(" y=1tan / 1/tan(x) = " + calc.doCalculation(100));
        System.out.println(" y=tan / 1/tan(x) = " + calc.doCalculation(90));
        System.out.println(" y=tan / 1/tan(x) = " + calc.doCalculation(-1111));

        System.out.println(" y=tan / 1/tan(x) = " + calc.doCalculationWithInputInside());
    }
}

