package hfj.r04;
class XCopy{
	public static void main(String[] args){
		int org = 42;
		XCopy x = new XCopy();
		int y = x.jazda(org);
		System.out.println(org+" "+y); // this line should print "42 84" 
	}
	int jazda(int arg){
		arg=arg*2;
		return arg;
	}
}
