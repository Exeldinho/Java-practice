import java.util.Scanner;

public class elseIf {

	public static void main(String[] args) {
		String[][] base = new String [6][6];
		base[0][0] = ("�����, �� ��� �����? ");
		base[1][0] = ("������� ������ �������� ���� �� � ����� ��������: ");
		base[2][0] = ("������ ��������� �� ����� � ������������ ��������� � �������? ");
		base[3][0] = ("������ ��������� � ������� �� ��������: ");
		base[4][0] = ("������ � ���������� ���������� �� ������� ");
		base[5][0] = ("������ � �� ������ �� � ����� ���� � ���볿? ");
		String[] phoneBase = {"1.Samsung S9 - 620",
							  "2.Samsung S9 plus - 750",
                              "3.Samsung S10 - 900",
							  "4.Samsung S10 plus - 1400"};
			for (int i = 0; i < base.length; i++)
			{
				System.out.println(base [i][0]);
			    @SuppressWarnings("resource")
				Scanner userInput = new Scanner(System.in);
			    	if (i == 1) 
			    	{
			    		for (int j=0; j < phoneBase.length; j++) 
		    			  	System.out.println(phoneBase[j]);
			    	}
			      base[0][i] = userInput.nextLine();
			}
			
			for (int i = 1; i < base.length; i++)
			{
				int valueInt = Integer.parseInt(base [0][i]); 
				if (i == 1)
				{
						if (valueInt == 1)
						{
							base[0][1] = "620";
						}
						else if (valueInt == 2)
						{
							base[0][1] = "750";
						}
						else if (valueInt == 3)
						{
							base[0][1] = "900";
						}
						else if (valueInt == 4)
						{
							base[0][1] = "1400";
						}
						else 
						{
							System.out.println("�� ����� ���!");
							return;
						}
				}				
		   	}
			int oneWeekWithoutCosts = Integer.parseInt(base [0][4])-((Integer.parseInt(base [0][2]))+(Integer.parseInt(base [0][3])));
			int fullPeriodSalary = (Integer.parseInt(base [0][4]))*(Integer.parseInt(base [0][5]))*4;   		//�� �����
			int moneyCosts = fullPeriodSalary - (oneWeekWithoutCosts*4*(Integer.parseInt(base [0][5])));   	   	//����� ���� �������
			int moneyLeft = moneyCosts - (Integer.parseInt(base [0][1]));								 	     //������ ���������� ������
			double weeksTimetoBuy = Math.round((double)(Integer.parseInt(base [0][1])) / oneWeekWithoutCosts);   //������ ����� ��� ������									
			System.out.println("=======================");	
			System.out.println("³���, " + (base [0][0]) + " �������������� ������ ��� ������� �� �����:");
			System.out.println("��� �������� �������� ������� ������� ����������� - " + weeksTimetoBuy + " ����");
			System.out.println("�� �������� ��������� ������ ����������� � ���볿 � ��� ���������� - " + moneyLeft + " ������� ������");		
	}
}
