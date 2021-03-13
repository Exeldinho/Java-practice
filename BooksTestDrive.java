class BooksTestDrive {
	public static void main (String[] args){
	Books[] myBooks = new Books[3]; //під перемінною myBooks створюємо масив із 3 комірками, і записуємо в комірках посилання із значенням NULL
	int x = 0;
	myBooks[0] = new Books(); //створюємо об'єкт, присвоюємо посиланню вказівку на об'єкт myBooks
	myBooks[1] = new Books(); 
	myBooks[2] = new Books(); 
	myBooks[0].title = "Плоди Java"; //отримуємо доступ до об'єкту через посилання, яке записане в комірці масиву
	myBooks[1].title = "Java Гейтсбі";
	myBooks[2].title = "Збірник рецептів по Java";
	myBooks[0].author = "Боб";
	myBooks[1].author = "Сью";
	myBooks[2].author = "Ян";
	
		while (x < 3) {
		System.out.print(myBooks[x].title);
		System.out.print(", автор ");
		System.out.println(myBooks[x].author);
		x = x + 1;
		}
	
	}
}