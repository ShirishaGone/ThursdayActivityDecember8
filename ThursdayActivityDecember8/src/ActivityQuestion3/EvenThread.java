package ActivityQuestion3;

public class EvenThread extends Thread{
	
		public void run()
		{
			System.out.println("Even numbers are:");
			for(int i=0;i<10;i++)
			{
				if(i%6==0)
				{
					System.out.println("Even numbers are:"+i);
				}
				{
					System.out.println(" ");
				}
			}

		}			
}


