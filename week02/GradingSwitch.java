 import java.util.Scanner;
 
 public class GradingSwitch{
	 public static void main (String[] args) {
		 Scanner scanner= new Scanner(System.in);
		 char grade;
		 System.out.print("점수를입력하세요(0~100): ");
		 int score = scanner.nextInt();
		 switch (score/10) {
		 case 10: // score = 100
		 case 9: // score는90~99
		 grade = 'A';
		 break;
		 case 8: // score는80~89
		 grade = 'B';
		 break;
		 case 7: // score는70~79
		 grade = 'C';
		 break;
		 case 6: // score는60~69
		 grade = 'D';
		 break;
		 default: // score는59 이하
		grade = 'F';
		 }
		 System.out.println("학점은"+grade+"입니다");
		 scanner.close();
	 }
 }