package ActivityQuestion3;

 class OddThread extends Thread{
	public void run()
	{
		
		for(int j=0;j<8;j++)
		{
			if(j%4!=0)
			{
				System.out.println("Odd numbers are:");

			}
			{
				System.out.println(" "+j);
			}

		}
	}
}
