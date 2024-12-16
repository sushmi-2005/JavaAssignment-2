package thirdsemjavalab;
 class DivisionByZeroException extends Exception{
public DivisionByZeroException(String message) {
	super(message);
}
 }
 public class DivisionExample {
	 public static double divide (int numerator, int denominator)throws DivisionByZeroException{
		 if(denominator==0) {
			 throw new DivisionByZeroException("error: division by zero is not allowed");
		 }
		 return (double) numerator/denominator;
	 }
	 public static void main(String[] args) {
		 int num=5;
		 int den=2;
		 try {
          double result=divide(num,den);
          System.out.println("result:"+result);
		 }
		 catch(DivisionByZeroException e) {
			 System.out.println(e.getMessage());
		 }finally {
			 System.out.println("execution completed cleaning up resources if needed");
		 }
	 }
 }
