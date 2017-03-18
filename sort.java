public class sort{
	public static void main(String[] args)
	{
		double[] list = {6,4,3.5,9,1.2,78,54.2,54.8,78.9,91};
		
        SelectionSort(list);
		Bubblesort(list);
		InsertionSort(list);

	}


		public static void SelectionSort(double[] list)
		{
			int i;
			for (i = 0; i< list.length - 1; i++) 
			{
				double currentMin = list[i];
				int currentMinIndex = i;
				for(int j = i + 1; j < list.length; j++)
				{
					if(currentMin > list[j])
					{
						currentMin = list[j];
						currentMinIndex = j;
					}
				}
				if (currentMinIndex != i)
				{
					list[currentMinIndex] = list[i];
					list[i] = currentMin;
				}
			}
			for(int a = 0 ; a < list.length ; a++)
			{
				System.out.printf("%.2f " , list[a]);
			}
			System.out.println();
		}
		public static void Bubblesort(double[] list)
		{
			double temp;
			int i;
			for(i = 0; i < list.length - 1; i++)
			{
				for(int j = 0; j < list.length - 1 - i; j++)
				{
					if(list[j] > list[j + 1])
					{
						temp = list[j];
						list[j] = list[j + 1];
						list[j + 1] = temp;
					}
				}
			}
			for(int a = 0 ; a < list.length ; a++)
			{
				System.out.printf("%.2f " , list[a]);
			}
			System.out.println();
		}
		public static void InsertionSort(double[] list)
		{
			int i;
			double temp;
			for(i = 1; i < list.length; i++)
			{
				for (int j = i ;j > 0 ; j--) 
				{
					if(list[j] < list[j - 1])
					{
						temp = list[j];
						list[j] = list[j - 1];
						list[j -1] = temp;
					}
				}
			}
			for (int a = 0; a < list.length; a++)
		    {
				System.out.printf("%.2f ",list[a]);
			}
		    System.out.println();
		}
}