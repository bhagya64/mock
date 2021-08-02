package mock01;

public class matrix_2By3 {
	
	public static void main(String[] args) {
		
		int a[][]= {{12,23,45},{46,89,76}};
		
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}