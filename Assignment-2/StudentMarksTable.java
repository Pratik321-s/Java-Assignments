class StudentMarksTable
{
	public static void main(String []args)
	{
		int marks[][] = {
			{75, 80. 70},
			{65, 60, 68},
			{90, 85, 88}
		};
		
		System.out.println("Student\tSub1\tSub2\tSub3\tTotal\tAverage");
		
		for(int i = 0; i < 3; i++)
		{
			int total = 0;
			
			System.out.print("S" + (i+1) + "\t");
			
			for(int j = 0; j < 3; j++)
			{
				System.out.print(marks[i][j] + "\t");
				total = total + marks[i][j];
			}
			
			double average = total / 3.0;
			
			System.out.print(total + "\t" + average);
			System.out.println();
		}
	}
}