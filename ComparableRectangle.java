import java.util.Scanner;


		public class ComparableRectangle implements Comparable<ComparableRectangle> {
			Scanner input = new Scanner(System.in);
			double width;
			double length;
			double area; 
			
			public ComparableRectangle(double length, double width) {
			
			this.length = length;
			this.width = width;
			this.area = length * width;
			}
			@Override
			public int compareTo(ComparableRectangle rectangle) {
				ComparableRectangle compareTo = (ComparableRectangle)rectangle;
				if(this.area == compareTo.area)
					return 0;
				else if(this.area > compareTo.area)
					return 1;
				else
					return -1;
			}
	
}
