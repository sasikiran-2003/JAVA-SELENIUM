package pkg_java;

class DemoClass2{
	//String[] args ---> Command line arguments
	public static void main(String[] args){
		System.out.println("Hello New Learners!!!,Welcome");
		String args0="234";
		String args1="34637";
		System.out.println("args[0]: "+args0);
		System.out.println("args[1]: "+args1);
		System.out.println("Addition: "+(args0+args1));

		//Every primitive data type has a WRAPPER CLASS
		//Convert the String to an integer using 
		//a WRAPPER CLASS(Integer)
		int num1 = Integer.parseInt(args0);
		int num2 = Integer.parseInt(args1);
		System.out.println("New Addition: "+(num1+num2));


	}
}

