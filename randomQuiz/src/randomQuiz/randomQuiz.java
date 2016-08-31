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
int correct =0;
for (int i = 0; i < questions;i++){
	double pear =Math.random()*2;
	int first = (int)(Math.random()*10);
	int numberCorrect =0;
	int last = (int)(Math.random()*10)+first;
	String question1 ="what is the lowest possible number that '(int)(Math.random()*"+last+")+"+first+";' would generate";
	String question2 ="what is the highest possible number that '(int)(Math.random()*"+last+")+"+first+";' would generate";
	String question3 ="please enter the code for returning a psuedo-random number between "+first+" and "+(first+last-1)+" inclusive.";
if (pear<1){
	System.out.println(question1);
	int answer1 =scan.nextInt();
	if (answer1 == first){
		System.out.println("correct!");
		correct++;
	}
	else {
		System.out.println("incorrect, the correct answer is: "+first);
	}
}
else if (pear<2&&pear>1){
	System.out.println(question2);
	int answer2 =scan.nextInt();
	if (answer2 == last+first-1){
		System.out.println("correct!");
		correct++;
	}
	else {
		System.out.println("incorrect, the correct answer is: "+(last+first-1));
	}
}
else {
	System.out.println(question3);
	String answer3 =scan.next();
	if (answer3.equals("(int)(Math.random()*"+last+")+"+first )){
		System.out.println("correct!");
		correct++;
	}
	else {
		System.out.println("incorrect, the corect answer is: "+"(int)(Math.random()*"+last+")+"+first);
	}
}

}
System.out.println("Conratulations, you have finished the quiz. you scored a "+correct+" out of "+questions+". good job.");

	}

}
