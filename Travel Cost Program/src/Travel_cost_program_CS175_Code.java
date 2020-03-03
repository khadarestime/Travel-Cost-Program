import java.util.Scanner ; //import Scanner 
public class Travel_cost_program_CS175_Code {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//declare constants same as flow chart for clarity 
		double distance_Entered = 0.0 ; //user input 
		double fuel_Efficacy_SUV = 20; //given 
		double cost_Per_Gallon_SUV = 2.90; //given 
		double fuel_Efficacy_Sedan = 30; //given
		double cost_Per_Gallon_Sedan= 2.50; //given 
//		double fuel_Efficacy_Truck = 24; //according to www.car.com
//		double cost_Per_Gallon_Truck = 2.93; //made up 

		System.out.print("Will you be driving a (Sedan), (SUV), or (Truck)? ");
		String mode_of_Travel = in.next();
		if (mode_of_Travel.equals("SUV")) {
			System.out.print("Please enter expected distance that will be travelled: ");
			if (in.hasNextDouble()) {
				distance_Entered = in.nextDouble();
				System.out.println("Your total cost of travel: " + String.format("%.2f",(distance_Entered / fuel_Efficacy_SUV) * cost_Per_Gallon_SUV));
			}
			else {
				System.out.print("Incorrect Input. Please restart program and enter only numerical values next time.");
			}
		}
		else if (mode_of_Travel.equals("Sedan")) {
			System.out.print("Please enter expected distance that will be travelled: ");
			if (in.hasNextDouble()) {
				distance_Entered = in.nextDouble();
				System.out.println("Your total cost of travel: " + String.format("%.2f",(distance_Entered / fuel_Efficacy_Sedan) * cost_Per_Gallon_Sedan));
			}
			else {
				System.out.print("Incorrect Input. Please restart program and enter only numerical values next time.");
			}
		}
/*		else if (mode_of_Travel.equals("Truck")) {
			System.out.print("Please enter expected distance that will be travelled: ");
			if (in.hasNextDouble()) {
				distance_Entered = in.nextDouble();
				System.out.println("Your total cost of travel: " + String.format("%.2f",(distance_Entered / fuel_Efficacy_Truck) * cost_Per_Gallon_Truck));
			}
			else {
				System.out.print("Incorrect Input. Please restart program and enter only numerical values next time.");
			}
		}
*/
		else {
			System.out.print("Input not accepted. Please enter (Sedan), (SUV), or (Truck) for mode of travel. Please restart Program.");
		}
		in.close(); // must close Scanner

}

}
