package PatPro;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j =0; j <n; j++) {
				if ((j==0||j==4||(i==j&&j>0&&j<5)))
				{
					System.out.print("*"+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
