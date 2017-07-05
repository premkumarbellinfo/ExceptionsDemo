package assingnment4;

public class CardNameException extends Exception {
	public CardNameException(){
		
	}

	@Override
	public String toString() {
		return "you entered invalid card type";
	}
	
}
