
public class Sample_tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**������ 5. �������� ��������, ��� ������ �������� ����� � ������� �� 0 �� 10 �� ��� ��, 
		   ���� �����, ��� ����������� ��������� �� ����� ������ 2. ���� WHILE */	
		double rand;
		int count = 0;
		rand = Math.random()*10;
		count++;
	
		while (rand >= 2) {
			rand = Math.random()*10;
			count++;
		}
		System.out.println("������ ����� ����� ��� 2: " + (count-1) + "\n������ ������� �����: " + rand);
		
		/**������ 6. �������� ��������, ��� ������ �������� ����� � ������� �� 0 �� 10 �� ��� ��, 
		   ���� �����, ��� ����������� ��������� �� ����� ������ 2. ���� DO WHILE */	
		double rand1;
		int count1 = 0;
		do
		{
		rand1 = Math.random()*10;
		count1++;
		}
		while (rand1 >= 2);
		System.out.println("������ ����� ����� ��� 2: " + (count1-1) + "\n������ ������� �����: " + rand1);
		
		//������ 7*. �������� ��������, ��� �������� � ������� ������� �������� *�� ������
		for (int n = 1; n < 10; n++)
	    {
	    	for (int m = 1; m < 10; m++)
	    	{
	    		System.out.print(n * m + " ");
	    	}
	    	System.out.println();
	    }
		//������ 7. �������� ��������, ��� �������� � ������� ������� �������� 
		for (int i = 1; i < 10; i++)
	    {
	    	for (int k = 1; k < 10; k++)
	    	{
	    		System.out.println(i + " * " + k + " = " + i * k);
	    	}
	    	System.out.println("-----------");
	    } 
		//������ 8. �������� .. ������� �������� �� ������� � ��������� �������� ����� �� 1 �� 9 �� ����� �� 1 �� 5   BREAK
		for (int i = 1; i < 10; i++)
	    {
	    	for (int k = 1; k < 10; k++)
	    	{
	    		if (k > 5)
	    			break;
	    		System.out.println(i + " * " + k + " = " + i * k);
	    	}
	    	System.out.println("-----------");
	    }
		//������ 9. �������� .. ������� �������� ����� �� 1 �� 7 �������, � ��� 8 ����� ���������� �������� �� ����� ����� 6  BREAK with label
		lab: for (int i = 1; i < 10; i++)
	    {
	    	for (int k = 1; k < 10; k++)
	    	{
	    		if (k > 5 && i > 7)
	    			break lab;
	    		System.out.println(i + " * " + k + " = " + i * k);
	    	}
	    	System.out.println("-----------");
	    }  
	    //������ 10. �� �������� �� ������� ������� �������� ����� �� 1 �� 9 �� ����� �� 5 �� 7  CONTINUE
	        for (int i = 1; i < 10; i++)
	    {
	    	for (int k = 1; k < 10; k++)
	    	{
	    		if (k >= 5 && k <= 7)
	    			continue;
	    		System.out.println(i + " * " + k + " = " + i * k);
	    	}
	    	System.out.println("-----------");
	    }
	    
	}
}
