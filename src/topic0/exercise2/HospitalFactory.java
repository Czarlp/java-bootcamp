package topic0.exercise2;
import java.util.Scanner;

public class HospitalFactory extends Factory {
	
	Scanner scanner = new Scanner(System.in);
	int value;
	Hospital hospital;
	
	
	@Override
	public Hospital create() {
				
		System.out.print("Enter 0 for Public hospital or 1 for Private hospital: ");
		value = scanner.nextInt();
		
		switch(value) {
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

