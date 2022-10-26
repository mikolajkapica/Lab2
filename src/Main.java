public class Main {
    public static double potega(double x, double k) {
        if (k == 0) {
            return 1;
        }
        return x * potega(x, k - 1);
    }
    public static double silnia(int x) {
        if (x == 0) {
            return 1;
        }
        return x * silnia(x - 1);
    }
    public static double E_x_mk(double x, int n) {
        double suma = 0;
        // (x^0)/(0!) + (x^1)/(1!) + ... + (x^n)/(n!)
        for (int k = 0; k < n; k++) {
            suma += potega(x, k)/silnia(k);
        }
        return suma;
    }
    public static double Sin_x_mk(double x, int n) {
        double suma = 0;
        for (int k = 0; k < n; k++) {
            suma += (potega(-1, k) * potega(x, 2 * k + 1)) / silnia(2 * k + 1);
        }
        return suma;
    }

    public static double Cos_x_mk(double x, int n) {
        double suma = 0;
        for (int k = 0; k < n; k++) {
            suma += potega(-1, k)*potega(x, 2*k)/silnia(2*k);
        }
        return suma;
    }

    public static void main(String[] args) {
        // e do potęgi x, n elementów szeregu
        System.out.println(E_x_mk(1, 10));

        // sin o argumencie x, n elementów szeregu
        System.out.println(Sin_x_mk(4.3, 10));

        // cos o argumencie x, n elementów szeregu
        System.out.println(Cos_x_mk(4.3, 10));
    }
}