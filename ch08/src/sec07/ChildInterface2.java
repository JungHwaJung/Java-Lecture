package sec07;

public interface ChildInterface2 extends ParentInterface {

	@Override
	public default void method2() {System.out.println("야호1");}
	
	public abstract void method3();
	
}
