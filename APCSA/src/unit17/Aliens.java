package unit17;
import java.util.Random;
public class Aliens {
	private Alien[][] alienlist;
	public Aliens(){
		alienlist=new Alien[3][3];
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				Random r = new Random();
				Alien a = new Alien((i+1)*100, (j+1)*100,r.nextInt(4)+1 );
				alienlist[i][j]=a;
			}
		}
		
		
	}
	public Alien[][] returnAliens(){
		return alienlist;
	}

}
