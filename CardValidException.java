package assingnment4;

public class CardValidException extends Exception{
	public CardValidException(){
		
	}

	@Override
	public String toString() {
		return "your entered month and year is not valid";
	}
	
}
