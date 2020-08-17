
public class Calculator {
	public void add(int n){
		result += n;
	}
	
	public void substract(int n){
		result -= n;
	}
	
	public void multiply(int n){
		result *= n;
	}
	
	public void divide(int n){
		result /= n;
	}
	
	public void square(int n){
		result = n * n;
	}
	
	public int getReuslt(){
		return result;
	}
	
	public void clear(){
		result = 0;
	}
	
	private static int result;

}
