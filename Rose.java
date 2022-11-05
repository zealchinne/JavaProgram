class Rose {
	static int x=m();// testing logic in method
	static int m() {
		System.out.println("M method");
		return 0;
	}
	static { System.out.println(" Static block"); }
public static void main(String args[]){
	System.out.println("main method");
	}
}
