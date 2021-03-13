
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		int demoInt=5;
		demoInt=0x12; //demoInt=0xC; 
		System.out.println(demoInt);
		
		long demoLong=3000000000L;
		double demoDouble=12.25;
		demoDouble=5.;
		demoDouble=.24;
		demoDouble=0.124e4;
		demoDouble=1600e-2;
		System.out.println(demoDouble);
		
		float demoFloat=8.12f;
		
		double res = Math.sqrt(demoDouble);
		System.out.println(res);
		
		boolean demoBool = true;
		
		String demoString = "Мова\n\tпрограмування\n\t\t\t\"Java\"";
		demoString=null;
		System.out.println(demoString);
		
		char demoChar = 'H';
		demoChar ='\t';
		demoChar ='\u0041';
		demoChar = 75; // літера K, те саме що "demoChar = 'K' "
		System.out.println(demoChar);
		
		int int1, int2, int3;
		int1=int2=int3=3; //число 3 присвоєються з права ні ліво int3, int2, int1
		int result;
		result=(int1+int3)*(int2-2)%4;
		
		result=++int2;
				
		int1=int1+5;
		int1+=5;
		
		
		System.out.println("result="+result);
		
		System.out.println(int1>int2);
		
		boolean boolRes;
		boolRes = demoBool && (int1<int2); //    || - або, || - і, | - для перевірки приавої частини умови в або
		System.out.println(!boolRes); //     ! - логічне НІ
	}
		
}
