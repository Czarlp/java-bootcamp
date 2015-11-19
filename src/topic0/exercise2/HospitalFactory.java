package topic0.exercise2;
import java.util.Scanner;

public class HospitalFactory extends Factory {
	
	Scanner scanner = new Scanner(System.in);
	int value;
	Hospital hospital;
	
	
	@Override
	public Hospital create(int type) {
				
		switch(type) {
		
			case 0:
				hospital = new Public();
				break;
			case 1:
				hospital = new Private();
				break;
		}
		
		return hospital;
	}
}