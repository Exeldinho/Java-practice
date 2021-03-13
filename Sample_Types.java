
public class Sample_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2500;
		long l = 5000;
		l=i; //неявне перетворення int в тип long, після присвоєтсья значення i значенню l
		i=(int)l;//явне перетворення типу long в тип int, після присвоєтсья значення l значенню i
		System.out.println(i);
		
		String str1 = "Мова програмування";
		String str2 = null;
		str2 = str1 + " Java";
		System.out.println(str2);
		
		//Задача 1. Перевірити парність числа у змінній num
		int num = 15;
		if (num % 2 == 0) //умова перевіряє чи ділиться число на 2 без остачі
			System.out.println(num + " - число парне");
		else 
			System.out.println(num + " - число непарне");
		
		//Задача 2. Якщо перемінна містить слово Java тоді вивести на консоль "Мова програмування Java"
		String lang = "Java";
		if (lang.equals("Java")) //оскільки перемінна lang являється посиланям на об'єкт String то перевіряємо за допомогою команди equals
			System.out.println("Мова програмування Java");
		
		
		//Задача 3. Якщо перемінна немістить слово Java тоді вивести на консоль "Мова програмування не Java"
		String lang2 = "С++";
			if (!lang2.equals("Java")) //оскільки перемінна lang являється посиланям на об'єкт String то перевіряємо за допомогою команди equals. перемінна типу посилання
				System.out.println("Мова програмування не Java");
		
		//Задача 4. Написати програму, яка розпізнає деякі назви мов програмування 	(Java, C++, C#)
		String lang3 = "C#";
			if (lang3.equals("Java"))
					System.out.println("Мова програмування Java"); 
			else if (lang3.equals("C++"))
					System.out.println("Мова програмування C++");
			else if (lang3.equals("C#"))
					System.out.println("Мова програмування C#");
			else
					System.out.println("Мову програмування не опізнано");
		
		//Задача 4. Написати програму, яка виводить на консоль назву пори року в залежності	від її порядкового номеру	
		int season = 3;
		switch (season)  //switch працює тільки з цілочисельними константами і може здійснювати перевірку тільки на рівність
		{
			case 1:
				System.out.println("Зима");
				break;
			case 2:
				System.out.println("Весна");
				break;
			case 3:
				System.out.println("Літо");
				break;
			case 4:
				System.out.println("Осінь");
				break;
			default:
				System.out.println("Помилка");
		}
	}
}
