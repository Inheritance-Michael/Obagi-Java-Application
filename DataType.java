public class DataType{
	public static void main(String[] args){
		//interger type(byte,short,int,long)
		
		byte age = 50;
		System.out.printf("Your age is %d%n", age);
		
		short quantity = 32000;
		System.out.printf("I bought %d quantity of bags for my business %n", quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The Total Population In Nigeria is %d %n", populationInNigeria);
		
		long wordPopulation = 8000000000L;
		System.out.printf("The Word Population is %d %n", wordPopulation);
		
		//float-point type (float,double)
		float myBalance = 123465.345678F;
		System.out.printf("Your account Balance is %f%n", myBalance);
		
		double cbnReserve = 3456723.23456789234;
		System.out.printf("The CBN balance is %.5f %n", cbnReserve);
		
		//Boolean type (true,false)
		boolean isJavaFun = true;
		System.out.printf("Is Java a Fun Langage? %b %n", isJavaFun);
		
		//character type(char)
		char alpha = '@';
		System.out.printf("My Email is inheritance%cgmail.com %n", alpha);
	}
}