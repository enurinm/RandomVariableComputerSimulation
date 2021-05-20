
public class CalcPi {
	private double X;
	private double Y;
	private double Z;

	private void setXY() {
		this.X = Math.random();
		this.Y = Math.random();
	}
	
	boolean xyOnCircle () {
		boolean result=false;
		setXY();		
		double xy=0.0;
		xy=Math.pow(X-0.5,2)+Math.pow(Y-0.5,2);
		
		if(xy<=0.25) {
			result=true;
		}
		
		return result;
	}
	
	public double calcZ(int n) {
		double sum=0.0;
		
		for (int i=0;i<n;i++) {
			if(xyOnCircle()) {//in the circle
				sum++;
			}
		}
		
		Z=sum/n; // =pi/4
		Z=Z*4;
		return Z;
	}

}
