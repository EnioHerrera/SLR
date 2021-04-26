import java.text.DecimalFormat;
import java.util.Scanner;

public class LinearRegression{

	private static double b1;
	private static double b0;
	public void calculation(double SUMX,double SUMY,double SUMXY,double SUMX2,int n) {
		double B1, B0;
		B1= (n*SUMXY-SUMX*SUMY)/(n*SUMX2-SUMX*SUMX);
		B0= (SUMY*SUMX2-SUMX*SUMXY)/(n*SUMX2-SUMX*SUMX);
		setB1(B1);
		setB0(B0);
		String sValue = (String) String.format("%.2f", B1);
		Double newValue = Double.parseDouble(sValue);
		String sValue2 = (String) String.format("%.2f", B0);
		Double newValue2 = Double.parseDouble(sValue2);
		result(newValue2,newValue);
		
		double P, prediction=0;
		Scanner read = new Scanner(System.in);
		System.out.print("\n\n Prediction value x: ");
		P=read.nextDouble();
		prediction=B0+B1*P;
		System.out.println("\n"+prediction);
	}

	public void result(double B0,double B1) {
		System.out.println("yhat= "+B0+" + "+B1+"x");
		LinearRegression.setB0(B0);
		LinearRegression.setB1(B1);
	}
	public static double getB0() {
		return b0;
	}
	public static void setB0(double b0) {
		LinearRegression.b0 = b0;
	}
	public static double getB1() {
		return b1;
	}
	public static void setB1(double b1) {
		LinearRegression.b1 = b1;
	}

}


