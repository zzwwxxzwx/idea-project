package Test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class areaCaculating {
    private static double a =0;
    private static double b =0;
    private static double c =0;

    private static double function(double x){
        double result = -Math.pow(x,3)/6/a + Math.pow(x,2)/2/b - c*x/b;
        return result;
    }
    public static void main(String[] arg) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(Br.readLine());
        String str = null;
        while ((str = Br.readLine()) != null) {
            String[] arr = str.split(" ");
            a = Double.parseDouble(arr[0]);
            b = Double.parseDouble(arr[1]);
            c = Double.parseDouble(arr[2]);
            double delta = 1 / b / b - 2 * c / a / b;
            if (delta <= 0) {
                System.out.println("0");
            } else {
                double x1 = (a + Math.sqrt(delta)) / b;
                double x2 = (a - Math.sqrt(delta)) / b;
                double area = function(x1) - function(x2);
                System.out.println(area);
                //System.out.println(function(x1) - function(x2));
                //System.out.println(String.format("%f12",function(x1) - function(x2)));
            }

        }
    }
}