package assingnment4;

public class CardCVVException extends Exception {

	public CardCVVException() {
		
		
	}

	@Override
	public String toString() {
		return "your CVV number should be of size 3";
	}
	
}
