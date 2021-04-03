import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringinput = "0";
		String check = "0";
		Boolean loop = true;
		
		Card cardNum = new Card();
		
		while (loop) {
		
			System.out.println("Type your card in shorthand: ");
			Scanner input = new Scanner(System.in);
			
			stringinput = input.next();
			try {
				
				stringinput.substring(0, 2);   //Make sure it can't break
			} catch(Exception e){
				stringinput = "00";
			}
			
			check = stringinput.substring(0, 2);
			if (stringinput.length() == 2 || (stringinput.length() == 3 && check.equals("10"))) {  //check length
				check = "0";
			}else {
				stringinput = "00";
			}
			
			cardNum.getInput(stringinput);
			System.out.println(cardNum.getCard() + cardNum.getSuit()); //send input and 
			

			System.out.println("Go again?");
			stringinput = input.next();
			if (stringinput.equals("yes")) {  //Repeat
				stringinput = "00";
			}else {
				loop = false;
				input.close();  //yellow triangle scary
			}
		}
		
	}

}
