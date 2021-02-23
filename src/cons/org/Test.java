package cons.org;

public class Test {
	
	public Test() {
	    this("JAVA");
	    System.out.println("Default const...");
	  }

	  public Test(int id) {
	    this(3456.5678f);
	    System.out.println(id);
	  }

	  public Test(String name) {
	    this(12);
	    System.out.println(name);
	  }

	  public Test(float sal) {
	    System.out.println(sal);
	  }

	  public static void main(String[] args) {
		  Test a = new Test();
	  }

	}

