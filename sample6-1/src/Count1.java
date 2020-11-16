
public class Count1 {
	public static void main(String[] args) {
		for(int i = 0; i< 3; i++) {
			System.out.println(i);
		}
		System.out.println("");
		for(int i = 0; i< 10; i++) {
			System.out.println(i + "の2乗は" + (i * i) + "で、3乗は" + (i * i * i) + "です。");
		}
		System.out.println("");
		for(int i = 0; i< 10; i++) {
			System.out.print(i + ":");
			for(int j = 0; j< i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("end");
	}
}
