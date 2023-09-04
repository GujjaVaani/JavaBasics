package patterns;
/*--
           *
         * *
       * * *
     * * * *
   * * * * *
 --*/
public class LeftTriangleStarPattern {
	public static void main(String[] args) {
		int row=5;
		int i,j;
		for(i=0;i<row;i++) {
			for(j=2*(row-i-1);j>0;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
