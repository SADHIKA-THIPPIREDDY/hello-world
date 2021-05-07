
public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
	        int[] ar1 = new int[100];
	        for( i = 0; i <  ar1.length; i++) {
	            ar1[i] = (int) (Math.random() * 100);
	            System.out.print(ar1[i] + "  ");
	        }
	}

}
