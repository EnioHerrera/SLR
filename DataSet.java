public class DataSet {

	//static double[] x = new double[] {2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013};
	//static double[] x = new double[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	//static double[] y = new double[] {40,39,41,29,32,30,33,15,10,11,20,24,10,15};
	//static double[] x = new double[] {3,12,15,22,28,35,42,49};
	//static double[] y = new double[] {35,60,15,30,20,41,17,30};
	//static double[] x = new double[] {1,2,2,3,4,4,5,6};
	//static double[] y = new double[] {2,3,4,4,4,6,5,7};
	static double[] x = new double[] {1,2,3,4,1,2,3,4,1,2,3,4};
	static double[] y = new double[] {371,514,490,312,308,485,500,410,390,505,457,427};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double SUMX=0,SUMY=0,SUMXY=0,SUMX2=0;
		double[] x=getx();
		double[] y=gety();
		n=x.length;
		for(int i=0; i < n; i++) {
			SUMX= SUMX + x[i];
			SUMY= SUMY + y[i];
			SUMXY= SUMXY + x[i]*y[i];
			SUMX2= SUMX2 + x[i]*x[i];
		}
		
		LinearRegression Dataset1= new LinearRegression();
		Dataset1.calculation(SUMX, SUMY, SUMXY, SUMX2, n);
		
	}
	
	
	public static double[] getx() {
		return x.clone();
	}
	public static double[] gety() {
		return y.clone();
	}
}
