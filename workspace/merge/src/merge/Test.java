package merge;

public class Test {

	public static void main(String[] args) {
//김민주
		for(int i=1;i<=10;i++) {
			System.out.println("i"+ i);
		}
//김준호
		for(int i=1; i< 11; i++) {

			System.out.println("����ȣ" + i);
			if(i % 2 == 1) {
				System.out.println(i + "��¦��");
			}else if(i % 2 == 0) {
				System.out.println(i + "�� Ȧ��");
			System.out.println("김준호" + i);
			if(i % 2 == 1) {
				System.out.println(i + "는 짝수다");
			}else if(i % 2 == 0) {
				System.out.println(i + "는 홀수다");
			}
			

			System.out.println("minju " + i);

			}
		}	
	}
}