package innerClass;
class Method {
	int a=10;
	  void m1() {
		System.out.println("m1 method called");
		  class InsideMethod{
			  void m1() {
				System.out.println("inside class method called");
				System.out.println(a);
			}
		}
		InsideMethod im=new InsideMethod();
		im.m1(); 
		System.out.println(a);
	}
}

public class MethodClass {

	public static void main(String[] args) {
		  Method obj=new Method();
		  obj.m1(); 
 
	}

}
