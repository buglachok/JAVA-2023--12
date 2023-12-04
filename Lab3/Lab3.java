package Lab3;
public class Lab3 {
    // Вар 6: 1, 7, 13
    public static void main(String[] args) throws Exception
    {
        System.out.println("Result of task1: " + task1(6, 30, 1)); // m - по завданню задаємо будь яке
        System.out.println("Result of task7: " + task7(6, 1));
        System.out.println("Result of task13: " + task13(0.001));
    }
    public static double task1(double m, int max_k, int i){
        double sum = 0;
        for(;i <= max_k;i++) {
            sum += Math.sqrt(m * (1.0 / i)) * Math.sin(m*i);
        }

        return sum;
    }
    public static double task7(int t, int i){
        double y = 0;

        if(i == 1 || i == 2){
            y = Math.log(t);
        } else if(i > 2){
            for(int k = 1; k <= i; k++) {
                y += Math.sin(t) / k;
            }
        } else {
            System.out.println("The equation is not solved because i < 1. Return Nan");
            y = Double.NaN;
        }

        return y;
    }
    public static double task13(double epsilon){
        
        if(epsilon < 0){
            System.out.println("Warning: epsilon < 0. Return Nan." );
            return Double.NaN;
        }

        double infSum = 0;
        for(int i = 1; true; i++)
        {
            double factorial_i = 1;

            for(int j = 1; j <= i; j++){
                factorial_i *= j;
            }

            double a_i = Math.pow(-1, i) / factorial_i;

            // необхідна точність досягнута якщо черговий доданок 'Ai' виявився по модулю меншим epsilon: 
            // |Ai| < epsilon
            if(Math.abs(a_i) < epsilon)
            {
                break;
            } else{
                infSum += a_i;
            }
        }

        return infSum;
    }
}