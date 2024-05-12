import java.util.Scanner;

public class KMS20201910_mid1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] choice = {"가위","바위","보"};
		
		String com_choice;
		String my_choice;
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("게임은 승부가 날때까지 진행됩니다.");
		System.out.println("=========================");
		while(true) {
			System.out.print("당신은 무엇을 낼 것인가요? : ");
			my_choice = s.next();
			com_choice = choice[(int)(Math.random()*3)];
			System.out.printf("컴퓨터의 선택 : %s\n", com_choice);
			
			if (!my_choice.equals("가위") && !my_choice.equals("바위") && !my_choice.equals("보")) {
				System.out.println(my_choice);
				System.out.println("잘못된 입력");
			}
			else if (my_choice.equals(com_choice)) {
				System.out.println("비겼습니다.");
			}
			else if ((my_choice.equals("가위") && com_choice.equals("보")) || (my_choice.equals("바위")&& com_choice.equals("가위")) || (my_choice.equals("보") && com_choice.equals("바위"))) {
				System.out.println("당신이 이겼습니다");
				break;
			}
			else {
				System.out.println("당신이 졌습니다");
				break;
			}
		}
	}
}
