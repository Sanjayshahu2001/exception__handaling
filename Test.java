import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int s1,e;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Point : ");
		s1=Integer.parseInt(s.nextLine());
		System.out.println("Enter End Point : ");
		e=Integer.parseInt(s.nextLine());
		for(int i=s1;i<=e;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" x "+j+" = "+(i*j));
				
			}
			//n++;
			System.out.println();	
			
		}
		System.out.println("End");
		
	}

}
