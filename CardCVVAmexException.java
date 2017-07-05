package assingnment4;

public class CardCVVAmexException extends Exception{

	public CardCVVAmexException() {
		
	}

	@Override
	public String toString() {
		return "your CVV number should be of size 4";
	}
	
}
