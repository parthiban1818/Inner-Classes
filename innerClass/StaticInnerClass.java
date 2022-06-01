package innerClass; 

public class StaticInnerClass {
	int num=20;
	static String name="zoho";
	void outer() {
		 System.out.println("outer class non static method");
	 }
	 void outerStatic() {
		 System.out.println("outer class static method");
	 } 
	public static void main(String[] args) {
		StaticInnerClass out =new StaticInnerClass();
		Inner in=new Inner(); 
          System.out.println(in.name);
	}
	//static inner class
	static class Inner{
		int in=10;
		static String name="parthiban";
	  	   void inner() {
	  		  
	  		   System.out.println("Inner class non static method");
	  	   }
	  	   void innerStatic() {
	  		   System.out.println("Inner classstatic method");
	  	   }
	     }
}
