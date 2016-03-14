
public class QuadraticEquation {
	
	private int a,b,c;
	
	public QuadraticEquation(int a, int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void setA(int a){
		this.a = a;
	}
	public void setB(int b){
		this.b = b;
	}
	public void setC(int c){
		this.c = c;
	}
	public double getDelta(){
		return Math.pow(b, 2)-(4*a*c);
	}
	public double getX0(){
		double x0 = 0;
		if(getDelta() == 0) { 
			x0 = -b/(2*a);
		}
		return x0;			
	}
	public double getX1(){
		double x1 = 0;
		if(getDelta() > 0){
			x1 = (-b-getDelta())/(2*a);
		}
		return x1;
	}
	public double getX2(){
		double x2 = 0;
		if(getDelta() > 0){
			x2 = (-b+getDelta())/(2*a);
		}
		return x2;
	}
	public String printSolution(){
		String solution = "";
		if(getDelta() > 0){
			solution = "Delta: "+getDelta()+",\nx1: "+getX1()+",\nx2: "+getX2();
		}else if(getDelta() == 0){
			solution = "Delta: 0,\nx1: "+getX0();
		}else{
			solution = "Sorry";
		}
		
		return solution;
	}
}
