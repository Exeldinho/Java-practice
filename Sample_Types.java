
public class Sample_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2500;
		long l = 5000;
		l=i; //������ ������������ int � ��� long, ���� ���������� �������� i �������� l
		i=(int)l;//���� ������������ ���� long � ��� int, ���� ���������� �������� l �������� i
		System.out.println(i);
		
		String str1 = "���� �������������";
		String str2 = null;
		str2 = str1 + " Java";
		System.out.println(str2);
		
		//������ 1. ��������� ������� ����� � ����� num
		int num = 15;
		if (num % 2 == 0) //����� �������� �� ������� ����� �� 2 ��� ������
			System.out.println(num + " - ����� �����");
		else 
			System.out.println(num + " - ����� �������");
		
		//������ 2. ���� �������� ������ ����� Java ��� ������� �� ������� "���� ������������� Java"
		String lang = "Java";
		if (lang.equals("Java")) //������� �������� lang ��������� ��������� �� ��'��� String �� ���������� �� ��������� ������� equals
			System.out.println("���� ������������� Java");
		
		
		//������ 3. ���� �������� �������� ����� Java ��� ������� �� ������� "���� ������������� �� Java"
		String lang2 = "�++";
			if (!lang2.equals("Java")) //������� �������� lang ��������� ��������� �� ��'��� String �� ���������� �� ��������� ������� equals. �������� ���� ���������
				System.out.println("���� ������������� �� Java");
		
		//������ 4. �������� ��������, ��� ������� ���� ����� ��� ������������� 	(Java, C++, C#)
		String lang3 = "C#";
			if (lang3.equals("Java"))
					System.out.println("���� ������������� Java"); 
			else if (lang3.equals("C++"))
					System.out.println("���� ������������� C++");
			else if (lang3.equals("C#"))
					System.out.println("���� ������������� C#");
			else
					System.out.println("���� ������������� �� �������");
		
		//������ 4. �������� ��������, ��� �������� �� ������� ����� ���� ���� � ���������	�� �� ����������� ������	
		int season = 3;
		switch (season)  //switch ������ ����� � �������������� ����������� � ���� ���������� �������� ����� �� ������
		{
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("�����");
				break;
			case 3:
				System.out.println("˳��");
				break;
			case 4:
				System.out.println("����");
				break;
			default:
				System.out.println("�������");
		}
	}
}
