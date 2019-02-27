package task22;

public class AnonymousInnerClass {
	  static Demo demo = new Demo() {
	        @Override
	        public void change() {
	            super.change();
	            int b = 1;
	            System.out.println(b);
	        }
	    };
	}

class Demo {
      void change() {
	   int a = 0;
	   System.out.println(a);
      }
}

