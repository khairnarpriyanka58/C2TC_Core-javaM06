
 class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<10; i++)
		{
			if(i%2==0)
				continue;
			System.out.println(i);
			
		}
	}

}
/*public class Continue {
	public static void main(String[] args) {
		int x=0;
		do {
			x++;
			System.out.println(x);
										if (++x<5)
												continue;
												x++;
												System.out.println(x);
			
			} while(++x<10);
	}
}
*/