package merge;

public class Test {
	public static void main(String[] args) {
		for(int i=1; i< 11; i++) {
			System.out.println("±èÁØÈ£" + i);
			if(i % 2 == 1) {
				System.out.println(i + "´ÂÂ¦¼ö");
			}else if(i % 2 == 0) {
				System.out.println(i + "´Â È¦¼ö");
			}
		}
		
		//wonhee
		for(int i = 0; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println("Â¦¼ö : "+i);
			}else {
				System.out.println("È¦¼ö : "+i);
			}
		}
	}

}
