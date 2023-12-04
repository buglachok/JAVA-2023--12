package Lab2;
// Вар 6: 16,17,18
public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Result of task16: " + task16(0.58, 0.34, 1.25, -1.89));
        System.out.println("Result of task17: " + task17(-1.49, 23.4, 1.23, 2.254));
        System.out.println("Result of task18: " + task18(2.34, 0.756, 2.23, -1.653)); // Видасть Nan, бо arcsin(-1.653) - не існує
    }
    public static double task16(double a, double b, double c, double d){
        double y = 2 * (Math.sin(a) / Math.acos(-2*b)) - Math.sqrt(Math.log(c * Math.abs(2*d)));
        return y;
    }
    public static double task17(double a, double b, double c, double d){
        double y = 2 * Math.sqrt(Math.tan(Math.abs(a + c))) + Math.log(b) / Math.pow(c, d);
        return y;
    }
    public static double task18(double a, double b, double c, double d){
        double y = ((Math.pow(Math.E, c) + 2 * (Math.log(a) / Math.log(2))) / Math.sqrt(Math.pow(c, b))) * Math.abs(Math.asin(d));
        return y;
    }
}