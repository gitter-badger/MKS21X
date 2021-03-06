public class Temperature {
    public static double CtoF(double t) {
	return t * (9.0/5.0) + 32;
    }

    public static double FtoC(double t) {
	return (t - 32) * (5.0/9.0);
    }

    public static void main(String[] args) {
	System.out.println(CtoF(-40.0));
	System.out.println(CtoF(100.0));
	System.out.println(FtoC(212.0));
    }
}
