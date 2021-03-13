import java.util.Scanner;


public class Kalkulator {

	public static void main(String[] args) {
		{
			Scanner vidKorystuvacha = new Scanner(System.in);
			double a, b, result;
			String diya;
			
			
			System.out.println("Введіть перше число..");
			a = Double.parseDouble(vidKorystuvacha.nextLine());
			
			System.out.println("Введіть друге число..");
			b = Double.parseDouble(vidKorystuvacha.nextLine());
			
			System.out.println("Введіть дію (+-*/):");
			diya = vidKorystuvacha.nextLine();
			
			if (diya.equals("/") && b == 0)
			{
				System.out.println("Upps! На нуль ділити не можна");
				return;
			}
			
			if (diya.equals("+") || diya.equals("додавання")) 
			{
				result = a + b;	
			}
			else if (diya.equals("-") || diya.equals("віднімання"))
			{
				result = a - b;	
			}
			else if (diya.equals("*") || diya.equals("множення"))
			{
				result = a * b;	
			}
			else if (diya.equals("/") || diya.equals("ділення"))
			{
				result = a / b;	
			}
			else 
			{
				result =0;
			}
			
			System.out.println("Результат: " + result);
		}

	}

}
