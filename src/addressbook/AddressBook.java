package addressbook;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		String First_Name;
		String Last_Name;
		String Address;
		String City;
		String State;
		int Zip;
		long PhoneNo;
		String Email;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First name  ");
		First_Name = scanner.nextLine();
		System.out.println("Enter Last name ");
		Last_Name = scanner.nextLine();
		System.out.println("Enter Address ");
		Address = scanner.nextLine();
		System.out.println("Enter city name ");
		City = scanner.nextLine();
		System.out.println("Enter State name ");
		State = scanner.nextLine();
		System.out.println("Enter Zip Code");
		Zip = scanner.nextInt();
		System.out.println("Enter phone Number ");
		PhoneNo = scanner.nextLong();
		System.out.println("Enter Email Id ");
		Email = scanner.next();
		scanner.close();
		
		System.out.println("\n First Name -" + First_Name + "\n Last Name -" + Last_Name + "\n Address -" + Address
				+ "\n City Name -" + City + "\n State Name -" + State + "\n Zip code -" + Zip + "\n Phone number -"
				+ PhoneNo + "\n Email id -" + Email);
	}

	public void address(Object object, Object object2, Object object3, Object object4, Object object5, int i,
			Object object6, Object object7) {
		// TODO Auto-generated method stub
		
	}

}
