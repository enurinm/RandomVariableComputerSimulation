
public class CalcExp {
	private double X;
	private double Z;

	private void setX() {
		this.X = Math.random();
//		this.Y = Math.random();
	}
	
	double exp0_1() {
		setX();		
		double exp=0.0;
		exp=Math.exp(X);
		
		return exp;
	}
	
	public double calcIntegralExp(int n) {
		double sum=0.0;
		
		for (int i=0;i<n;i++) {
			sum+=exp0_1();
		}
		
		Z=sum/n;
		return Z;
	}
}
