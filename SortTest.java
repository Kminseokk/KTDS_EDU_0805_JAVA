package java0805;
import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("������ �����ϼ���.");
		System.out.println("Q : �������� �մϴ�. ");
		System.out.println("B : ���������� �մϴ�. ");
		System.out.println("H : �������� �մϴ�. ");
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		sort.description();
		sort.ascending([1,2,3,4]);
		sort.descending(null);
		}
}
