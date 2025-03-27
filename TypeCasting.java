public class TypeCasting{
	public static void main(String[] args){
		//widenig Type casting
		double weight = 678;
		System.out.printf("Your weight is %f %n", weight);
		
		//Narrowig typeCasting
		char alpha = '?';
		
		int asciiCode = (char)alpha;
		System.out.printf("The asciiCode for '?' is %d %n", asciiCode);
		
		double height = 5.8;
		
		int myheight = (int)height;
		System.out.printf("My faculty's height is %d %n",myheight);
	}
}