/**
public class EchoTestDrive {
	public static void main (String[] args) {
	Echo e1 = new Echo(); //створюємо посилання e1 на об'єкт Echo
	Echo e2 = new Echo(); //створюємо посилання e2 на другий об'єкт Echo
	int x = 0;
	while (x < 4){
		e1.hello();
		e1.count = e1.count + 1;
		if ( x == 3 ){
			e2.count = e2.count + 1;
		}
		if ( x > 0 ){
			e2.count = e2.count + e1.count;
		}
		x = x + 1;
	}
	System.out.println(e2.count); //вивід 10
	
	}
	
} */

public class EchoTestDrive {
	public static void main (String[] args) {
	Echo e1 = new Echo(); //створюємо перше посилання e1 на об'єкт Echo
	Echo e2 = e1; 		  //створюємо додаткове (друге) посилання e2 на об'єкт Echo
	int x = 0;
	while (x < 4){
		e1.hello();
		e1.count = e1.count + 1;
		if (x > 0){
			e2.count = e2.count + 1;
		}
		if (x > 1){
			e2.count = e2.count + e1.count;
		}
		x = x + 1;
	}
	System.out.println(e2.count); //вивід 24
	
	}
	
}