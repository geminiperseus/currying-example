import java.util.function.DoubleUnaryOperator;

public class CurringExample {

    public static void main(String[] args) {
        DoubleUnaryOperator convertCtoF = curriedConverter(9.0/5, 32);
        DoubleUnaryOperator convertUSDtoGBP = curriedConverter(0.6, 0);
        DoubleUnaryOperator convertKmtoMi = curriedConverter(0.6214, 0);

        double gbp = convertUSDtoGBP.applyAsDouble(1000);
        System.out.println("1000 $ is " + gbp + " GBP");

        double tempInFarenhiet = convertCtoF.applyAsDouble(0);
        System.out.println("0 C is " + tempInFarenhiet + " F");

        double miles = convertKmtoMi.applyAsDouble(160);
        System.out.println("160 KM is " + miles + " miles");

    }
    static DoubleUnaryOperator curriedConverter(double f, double b){
        return (double x) -> x * f + b;
    }
}
