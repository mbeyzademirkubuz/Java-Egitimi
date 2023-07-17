package Arrays;

public class multidimensionalArray {

	public static void main(String[] args) {
		String[][] cities = new String [3][3];
		
		cities[0][0] = "Ýstanbul";
		cities[0][1] = "Ýzmir";
		cities[0][2] = "Isparta";
		cities[1][0] = "Konya";
		cities[1][1] = "Eskiþehir";
		cities[1][2] = "Kocaeli";
		cities[2][0] = "Mersin";
		cities[2][1] = "Marmaris";
		cities[2][2] = "Antalya";
		
		for(int i =0 ; i<=2 ; i++) {
			System.out.println("------------");
			for (int j=0; j<=2; j++) {
				System.out.println(cities[i][j]);
			}
		}

	}

}
