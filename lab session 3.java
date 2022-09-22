package calculation;
class A{
	void methodA() {
		System.out.println("method of class A");
	}
}
 class B extends A{
      void methodB(){
		System.out.println("method of class B");
}
class C extends A{
	void methodC() {
		System.out.println("method of class C");
	}
}
class D extends A{
	void methodD() {
		System.out.println("method of class D");
	}
}

      
      
 class HierarchicalTest {

	 public  void main(String[] args) {
	B ob1=new B();
	C ob2=new C();
	D ob3=new D();
	ob1.methodB();
	ob1.methodA();
	ob2.methodC();
	ob2.methodA();
	ob3.methodD();
	ob3.methodA();
    }	 
}
    }
 
 
     
                         
	


