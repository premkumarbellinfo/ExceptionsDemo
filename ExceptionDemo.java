package assingnment4;

import java.util.Calendar;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) throws CardException {
		Scanner scan = new Scanner(System.in);
		//char ch = '1';
		//boolean d = Character.isDigit(ch);
		//System.out.println(d);
		
		System.out.println("Enter your credit card number");
		String number = scan.next();
		if (number.length() != 16){
		try{
			
			if(number.length() == 16){
				System.out.println("you entered 16 digit number");
			}
			else{
				throw new CardNumberException();
			}
		}catch(CardNumberException a){
			System.out.println(a);
		}
		}
		//CardException f = new CardException();
		else{
		try{
				char[] num = new char[number.length()];
				num = number.toCharArray();
				boolean x = true;
				
				for(int i=0;i<number.length();i++){
					x = x && Character.isDigit(num[i]);
				}
				if (x){
					System.out.println("your entered number is a valid 16 digit");
				}
				else{
					throw new CardException();
				}
			}catch(CardException b){
				System.out.println(b);
			}
		}
		System.out.println("Enter your credit card month");
		int usermonth = scan.nextInt();
		System.out.println("Enter your credit card year");
		int useryear = scan.nextInt();
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		try{
			if (useryear < year ){
				throw new CardValidException();
			}
			else if (useryear<year && usermonth < month){
				throw new CardValidException();
			}
			else{
				System.out.println("you entered valid month and date");
			}
		}catch(CardValidException j){
			System.out.println(j);
		}
		
		
		System.out.println("Enter your visa type");
		String userType = scan.next();
		userType = userType.toLowerCase();
		String[] type = {"visa","master","amex"};
		try{
			boolean valid = true;
			for(int i=0; i< type.length;i++){
				if(userType.equals(type[i])){
					valid = false;
					System.out.println("you entered valid visa type");
				}
				else{
					valid = valid && true;
				}
			}
			if(valid){
				throw new CardNameException();
			}
		}catch(CardNameException l){
			System.out.println(l);
		}
		System.out.println(userType);
		System.out.println("Enter your cvv number");
		String numberCVV = scan.next();
		
		if(userType.equals("amex")){
			try{
				if(numberCVV.length() == 4){
					System.out.println("you entered correct CVV number");
				}
				else{
					throw new CardCVVAmexException();
				}
			}catch(CardCVVAmexException a){
				System.out.println(a);
			}
			}
		else{
			try{
				if(numberCVV.length() == 3){
					System.out.println("you entered correct CVV number");
				}
				else{
					throw new CardCVVException();
				}
			}catch(CardCVVException a){
				System.out.println(a);
			}
			}
		
		
		scan.close();
	}
	

}
