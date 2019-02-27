package task22;

public class HomeworkApp {

	public static void main(String[] args) {
		 NestedInner.Inner x = new NestedInner().new Inner();
	        x.cube();
	        MemberOfOuterClass.Inner1 in = new MemberOfOuterClass.Inner1();
	        in.print();
	        MethodLocalInnerClass mlic = new MethodLocalInnerClass();
	        mlic.sum();
	        AnonymousInnerClass.demo.change();
	}

}