package merge;

public class Test {
	public static void main(String[] args) {
		for(int i=1; i< 11; i++) {
			System.out.println("����ȣ" + i);
			if(i % 2 == 1) {
				System.out.println(i + "��¦��");
			}else if(i % 2 == 0) {
				System.out.println(i + "�� Ȧ��");
			}
		}
	}

}
