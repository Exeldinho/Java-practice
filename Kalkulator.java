import java.util.Scanner;


public class Kalkulator {

	public static void main(String[] args) {
		{
			Scanner vidKorystuvacha = new Scanner(System.in);
			double a, b, result;
			String diya;
			
			
			System.out.println("������ ����� �����..");
			a = Double.parseDouble(vidKorystuvacha.nextLine());
			
			System.out.println("������ ����� �����..");
			b = Double.parseDouble(vidKorystuvacha.nextLine());
			
			System.out.println("������ �� (+-*/):");
			diya = vidKorystuvacha.nextLine();
			
			if (diya.equals("/") && b == 0)
			{
				System.out.println("Upps! �� ���� ����� �� �����");
				return;
			}
			
			if (diya.equals("+") || diya.equals("���������")) 
			{
				result = a + b;	
			}
			else if (diya.equals("-") || diya.equals("��������"))
			{
				result = a - b;	
			}
			else if (diya.equals("*") || diya.equals("��������"))
			{
				result = a * b;	
			}
			else if (diya.equals("/") || diya.equals("������"))
			{
				result = a / b;	
			}
			else 
			{
				result =0;
			}
			
			System.out.println("���������: " + result);
		}

	}

}
