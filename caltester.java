package Session5.Assignment5;

public class caltester {
	public static void main(String[] args) {
		ArrayCalculator m1 = new ArrayCalculator(3, 3);
		ArrayCalculator m2 = new ArrayCalculator(3, 3);
		
		m1.fillMatrix();
		m2.fillMatrix();
		
		m1.printMatrix();
		m2.printMatrix();
		
		m1.sum(m2);
		
		m1.difference(m2);
		
		m1.transpose();
		
		ArrayCalculator m3 = new ArrayCalculator(3, 2);
		ArrayCalculator m4 = new ArrayCalculator(2, 3);
		
		m3.fillMatrix();
		m4.fillMatrix();
		
		m3.product(m4);
		
}
}