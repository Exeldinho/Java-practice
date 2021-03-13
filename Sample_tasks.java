
public class Sample_tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**Задача 5. Написати програму, яка генерує випадкові числа в діапазоні від 0 до 10 до тих пір, 
		   поки число, яке згенероване програмою не стане меньше 2. цикл WHILE */	
		double rand;
		int count = 0;
		rand = Math.random()*10;
		count++;
	
		while (rand >= 2) {
			rand = Math.random()*10;
			count++;
		}
		System.out.println("Випало чисел більше чим 2: " + (count-1) + "\nОстаннє випавше число: " + rand);
		
		/**Задача 6. Написати програму, яка генерує випадкові числа в діапазоні від 0 до 10 до тих пір, 
		   поки число, яке згенероване програмою не стане меньше 2. цикл DO WHILE */	
		double rand1;
		int count1 = 0;
		do
		{
		rand1 = Math.random()*10;
		count1++;
		}
		while (rand1 >= 2);
		System.out.println("Випало чисел більше чим 2: " + (count1-1) + "\nОстаннє випавше число: " + rand1);
		
		//Задача 7*. Написати програму, яка виводить у консоль таблицю множення *мій варіант
		for (int n = 1; n < 10; n++)
	    {
	    	for (int m = 1; m < 10; m++)
	    	{
	    		System.out.print(n * m + " ");
	    	}
	    	System.out.println();
	    }
		//Задача 7. Написати програму, яка виводить у консоль таблицю множення 
		for (int i = 1; i < 10; i++)
	    {
	    	for (int k = 1; k < 10; k++)
	    	{
	    		System.out.println(i + " * " + k + " = " + i * k);
	    	}
	    	System.out.println("-----------");
	    } 
		//Задача 8. Написати .. таблицю множення які отримані в результаті множення чисел від 1 до 9 на числа від 1 до 5   BREAK
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
		//Задача 9. Написати .. таблицю множення чисел від 1 до 7 повністю, а для 8 тільки результати множення на числа менше 6  BREAK with label
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
	    //Задача 10. Не виводити на консоль таблицю множення чисел від 1 до 9 на числа від 5 до 7  CONTINUE
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
