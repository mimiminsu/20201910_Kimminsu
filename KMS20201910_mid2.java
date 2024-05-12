import java.util.Scanner;

public class KMS20201910_mid2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] Map = {'M','x','x','x','x','C'};
		int my_locate = 0;
		int com_locate = 5;
		boolean meet = false;
		String my_choice, com_choice;
		String[] rsp = {"가위","바위","보"};
		System.out.println("게임설명");
		System.out.println("1. 6칸의 말판이있고 가위바위보를 진행하여 상대진영에 도착하면 이기는 게임");
		System.out.println("2. 가위바위보에서 이겼을 때 상대방 진형으로 1칸 이동할 수 있다.");
		System.out.println("3. 상대방과 만났을 때 가위바위보를 진행해 지면 자신의 진형으로 다시 돌아가야한다.");
		System.out.println("4. 말판에서 당신이 'M' 상대방(컴퓨터)가 'C'이다.\n");
		
		while(true) {
			for(int i = 0; i<6; i++) {
				Map[i] = 'x';
			}
			Map[my_locate] = 'M';
			Map[com_locate] = 'C';
			
			if(my_locate == 4) System.out.println("이번에 가위바위보를 이기면 게임에서 승리합니다.");
			else if(com_locate == 1) System.out.println("이번에 가위바위보를 지면 게임에서 패배합니다.");
			
			if(my_locate+1 == com_locate) {
				System.out.println("이번에 지면 시작지점으로 돌아갑니다!!");
				meet = true;
			}
			
			System.out.println(Map);
			System.out.println("무엇을 낼 것입니까?  : ");
			my_choice = s.next();
			com_choice = rsp[(int)(Math.random()*3)];
			System.out.printf("컴퓨터의 선택 : %s\n", com_choice);
			if(!(my_choice.equals("가위")||my_choice.equals("바위")||my_choice.equals("보"))){
				System.out.println("잘못된 입력");
			}
			else if (my_choice.equals(com_choice)) {
				System.out.println("비겼습니다.");
			}
			else if ((my_choice.equals("가위") && com_choice.equals("보")) || (my_choice.equals("바위")&& com_choice.equals("가위")) || (my_choice.equals("보") && com_choice.equals("바위"))) {
				System.out.println("가위바위보에서 이겼습니다");
				my_locate++;
				if(my_locate == 5) {
					System.out.println("당신이 게임에서 승리하였습니다.");
					break;
				}
				if (meet) {
					com_locate = 5;	
					meet = false;
				}
			}
			else {
				System.out.println("가위바위보에서 졌습니다");
				com_locate--;
				if(com_locate == 0) {
					System.out.println("당신이 게임에서 패배하였습니다.");
					break;
				}
				if (meet) {
					my_locate = 0;
					meet = false;
				}
			}
			System.out.println();
		}
	}
}