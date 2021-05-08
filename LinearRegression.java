package examples.bookTrading;
import java.text.DecimalFormat;

public class LinearRegression{
	
	public static void main(String[] args) {
		/*double p=10;
		calculation(p);*/
	}

	public static void calculation(double P) {

		double[] x = new double[] {1,2,3,4,5,6,7,8,9};
      		double[] y = new double[] {23,26,30,34,43,48,52,57,58};
		int n;
		double SUMX=0,SUMY=0,SUMXY=0,SUMX2=0;
		n=x.length;
		for(int i=0; i < n; i++) {
			SUMX= SUMX + x[i];
			SUMY= SUMY + y[i];
			SUMXY= SUMXY + x[i]*y[i];
			SUMX2= SUMX2 + x[i]*x[i];
		}

		double B1, B0;
		B1= (n*SUMXY-SUMX*SUMY)/(n*SUMX2-SUMX*SUMX);
		B0= (SUMY*SUMX2-SUMX*SUMXY)/(n*SUMX2-SUMX*SUMX);
		String sValue = (String) String.format("%.2f", B1);
		Double newValue = Double.parseDouble(sValue);
		String sValue2 = (String) String.format("%.2f", B0);
		Double newValue2 = Double.parseDouble(sValue2);
		result(newValue2,newValue);

		double prediction=0;
		prediction=B0+B1*P;
		System.out.println("\n"+prediction);
	}

	public static void result(double B0,double B1) {
		System.out.println("yhat= "+B0+" + "+B1+"x");
	}

}


