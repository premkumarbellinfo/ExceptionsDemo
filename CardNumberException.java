package assingnment4;

public class CardNumberException extends Exception {
	String number;
	public CardNumberException(){
		//System.out.println("Something went Wrong");
	}

	
	@Override
	public String toString() { 
		return "Card number must be of size 16";
	
	}
}
