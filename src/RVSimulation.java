
public class RVSimulation {

	public static void main(String[] args) {
		
		int n=500;
		n=(int)Math.pow(10, 3);
		n=(int)Math.pow(10, 4);
		n=2*(int)Math.pow(10, 5);
		
		//simulate 1
		CalcExp ce= new CalcExp();
		double ceRes = ce.calcIntegralExp(n);
		System.out.println("(1) result: "+ceRes);
		
		//simulate 2
		CalcPi cp= new CalcPi();
		double cpRes = cp.calcZ(n);
		System.out.println("(2) result: "+cpRes);

	}

}
