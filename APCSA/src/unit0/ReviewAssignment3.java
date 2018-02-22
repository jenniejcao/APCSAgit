package unit0;

public class ReviewAssignment3 {

	public static void main(String[] args) {
		double seconds=365*24*60*60;
		double birth=seconds/7.0;
		double death=seconds/13.0;
		double immigrant=seconds/45.0;
		double year=312032486.0;
		int a=1;
		for (a=1; a<6; a++){
			System.out.println("Population year "+a+":\t"+(year+a*(birth+immigrant-death)));
		}

	}

}
