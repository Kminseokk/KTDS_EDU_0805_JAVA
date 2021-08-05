package java0805;

public class PriorityAllocation implements Scheduler {

	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}
	public void sendCallToAgent() {
		System.out.println("높은 등급의 고객의 전화를 업무 능력이 좋은 상담원에게 연결합니다.");
	}
	
}
