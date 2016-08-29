package randomQuiz;
import java.util.Scanner;
public class randomQuiz {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//old comment
System.out.println("how many questions would you like to answer?");
int questions = scan.nextInt();
String apple = "";
for (int i = 0; i < questions;i++){
	int first = (int)(Math.random()*10);
	int numberCorrect =0;
	int last = (int)(Math.random()*10)+first;
	String question1 ="what is the lowest possible number that '(int)(Math.random()*"+last+")+"+first+";' would generate";
	String question2 ="what is the highest possible number that '(int)(Math.random()*"+last+")+"+first+";' would generate";

	System.out.println("question1");
	
}

	}

}
