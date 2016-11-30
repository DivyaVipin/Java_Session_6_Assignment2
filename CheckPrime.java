import java.util.Scanner;

class Prime extends Thread
{
	int no;
	Prime(int n)
	{
		this.no=n;
	}
	public void run()
	{
		int flag=0;
		for(int i=2;i<no;i++){
			if(no%i==0)
			{
				System.out.println(no+" is not a Prime Number");
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println(no+" is a Prime Number");

	}
	
}
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		Thread  p=new Prime(no);
		p.start();

	}

}
