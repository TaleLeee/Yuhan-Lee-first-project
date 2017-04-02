import java.util.Scanner;
public class AreaOfConvexPolygon{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of points");
		int points = input.nextInt();

		double[] x = new double[points];
		double[] y = new double[points];
		double[] side = new double[points - 3];
		double[] s = new double[points];
		double[] p = new double[points - 2];
		int i;
		int j;
		int k;
		int a;
		int b;

		double sum = 0;
		
		System.out.println("Enter the coordinates of the points");
		for (i = 0; i < points ; i++)
		{
			x[i] = input.nextDouble();
            y[i] = input.nextDouble();
		}
        
		for(j = 2; j < points - 1; j++)
		{
         	side[j - 2] = Math.sqrt(((x[j] - x[0]) * (x[j] - x[0])) + ((y[j] - y[0]) * (y[j] - y[0])));
		}
        
		for(k = 0; k < points; k++)
		{
			if(k <= points - 2)
			{
			s[k] = Math.sqrt((x[k + 1] - x[k]) * (x[k + 1] - x[k]) + (y[k + 1] - y[k]) * (y[k + 1] - y[k]));
			}
			else
			s[points - 1] = Math.sqrt((x[points - 1] - x[0]) * (x[points - 1] - x[0]) + (y[points - 1] - y[0]) * (y[points - 1] - y[0]));
		}

		for(a = 0; a < points - 2; a++)
		{
			if(a == 0)
			{
				p[a] = (1.0 / 2) * (s[0] + s[1] + side[0]);
			}
			else if(a == points - 3)
			{
				p[a] = (1.0 / 2) * (s[points - 1] + s[points - 2] + side[points - 4]);
			}
			else
				p[a] = (1.0 / 2) * (side[a - 1] + side[a] + s[a + 1]);
		}

		for(b = 0; b < points - 2; b++)
		{
			if(b == 0)
			{
				sum = sum + Math.sqrt(p[0] * (p[0] - s[0]) * (p[0] - s[1]) * (p[0] - side[0]));
			}
			else if(b == points - 3)
			{
				sum = sum + Math.sqrt(p[b] * (p[b] - s[points - 1]) * (p[b] - s[points - 2]) * (p[b] - side[b - 1]));
			}
			else
				sum = sum + Math.sqrt(p[b] * (p[b] - side[b - 1]) * (p[b] - side[b]) * (p[b] - s[b + 1]));
		}
		System.out.println("the total area is" + sum);
	}
}