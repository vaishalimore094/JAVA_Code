package access_specifiers1;

import access_specifiers.Sample1;

public class Sample3 extends Sample1 {

	public static void main(String[] args) {
	
	Sample3 s3=new Sample3();
	//s3.Jayant();
	s3.reshma();//called protected method by using inherentance
	s3.vaishali();
	//s3.sourabh();
	

	}

}
//note---scope of public is all project;
//...scope of proteced is only package to define another call by use inheritance
//scope of default is only package
//scope of private is only within class