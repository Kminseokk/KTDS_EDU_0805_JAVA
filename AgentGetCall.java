package java0805;

public class AgentGetCall implements Scheduler{
	public void getNextCall() {
		System.out.println("상담원이 다음 전화를 요청합니다.");
	}
	public void sendCallToAgent() {
		System.out.println("상담원이 전화 상담을 가져갔습니다.");
	}
}
