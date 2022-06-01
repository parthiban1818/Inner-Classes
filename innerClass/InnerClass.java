package innerClass;

public class InnerClass {
	int ou =10;
	static int out1=20;
	 void outer() {
		 System.out.println("outer class non static method");
	 }
	 void outerStatic() {
		 System.out.println("outer class static method");
	 } 
	public static void main(String[] args) {
		InnerClass out = new InnerClass();
           Inner in=out.new Inner();
           out.outer();
           out.outerStatic();
           in.inner();
           in.innerStatic();
          System.out.println(in.out); 
	}
	 class Inner{
		 int out=30;
  	   void inner() {
  		 InnerClass o= new InnerClass();
  		 System.out.println(out);
  		 System.out.println(out1);
  		   System.out.println("Inner class non static method");
  	   }
  	   void innerStatic() {
  		   System.out.println("Inner classstatic method");
  	   }
     }

}
