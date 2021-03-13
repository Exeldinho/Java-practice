public class PhraseOMatic {
	public static void main (String[] args) {
	String [] wordListOne = {"цілодобовий", "трьох-зірковий", "300-метровий", "взаємний", "на основі веб технологій", "фронтенд", "розумний", "проникаючий", "шість стигмат", "метод критичного шляху", "динамічний"};
	String [] wordListTwo = {"орієнтований", "загальний", "вповноважений", "важкий", "розприділений", "центральний", "кластеризований", "позиційований", "мережевий", "сфокусований", "вигідно використовуваний", "націлений на", "пришвидшений", "спільний"};
	String [] worlListThree = {"процес", "пункт розвантаження", "вихід із ситуації", "тип структури", "талант", "підхід", "рівень завойованої уваги", "портал", "період часу", "огляд", "зразок", "пункт призначення"};
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = worlListThree.length;
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + worlListThree[rand3];
	System.out.println("Все, що нам потрібно, - це " + phrase);
	}
}
	