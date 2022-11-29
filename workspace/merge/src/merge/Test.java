package merge;

public class Test {

	public static void main(String[] args) {
//源�誘쇱＜
		for(int i=1;i<=10;i++) {
			System.out.println("i"+ i);
		}
//源�以��샇
		for(int i=1; i< 11; i++) {
			System.out.println("占쏙옙占쏙옙호" + i);
			if(i % 2 == 1) {
				System.out.println(i + "占쏙옙짝占쏙옙");
			}else if(i % 2 == 0) {
				System.out.println(i + "占쏙옙 홀占쏙옙");
			}
			
		}
	}	
}
