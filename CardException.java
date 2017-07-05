package assingnment4;

public class CardException extends Exception{
	public CardException(){
		//System.out.println("Something went wrong");
		//System.out.println("You entered 16 digits but one or more of them is not a digit");
	}

	@Override
	public String toString() {
		return "You entered 16 digits but one or more of them is not a digit";
	}
	
}
