package talkwalker.round2.jo.schimberg;

public class ChildClass extends SuperClass {
	
	@Override
	public void test(String test) {
		System.out.println("child");
		super.test(test);
		test2(test);
	}
	
	@Override
	public void test2(String test) {
		System.out.println("child 2");
	}
}
