package own;
/**
 * @author MengWei 2018Äê9ÔÂ26ÈÕ
 */
public class Triangle01 {
	public static void main(String[] args) {
		int base = ((int)(Math.random()*5+5))*2+1;
		for (int i = 0; i < base/2+1; i++) {
			for (int j = 0; j < base/2-i; j++) {
				System.out.print(" ");
			}
			if(2*i+1>2&&(i!=base/2)){
				System.out.print("*");
				for (int j2 = 0; j2 < 2*i-1; j2++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}else if(i==base/2){
				for (int j = 0; j < base; j++) {
					System.out.print("*");
				}
			}else{
				for (int j = 0; j < 2*i+1; j++) {
					System.out.print("*");
				}
			}
			for (int j = 0; j < base/2-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}