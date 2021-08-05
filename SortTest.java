package java0805;
import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("정렬을 선택하세요.");
		System.out.println("Q : 퀵정렬을 합니다. ");
		System.out.println("B : 버블정렬을 합니다. ");
		System.out.println("H : 힙정렬을 합니다. ");
		System.out.println("****************************** ");
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if(ch == 'Q'|| ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		sort.description();
		sort.ascending([1,2,3,4]);
		sort.descending(null);
		}
}
