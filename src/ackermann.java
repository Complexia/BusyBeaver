
public class ackermann {

	
	public static void main(String[]args) {
		
		System.out.println(ack(5,1));
	}
	static double returnValue = 0;
	static public double ack(double n, double m) {
		
		if(n == 0) {
			returnValue = m + 1;
		}
		else if(m == 0) {
			ack(n-1,1);
		}
		else {
			
			ack(n-1, ack(n, m-1));
		}
		
		return returnValue;
	}
}
