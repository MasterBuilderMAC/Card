
public class Card {

		public Card() {}
			private String suit = "0";
			private String yes = "0";  //All variables
			private String number = "0";
		

			
			
		
				
		public void getInput(String input) {
			
		yes = input;

		}
	
		public String getSuit() {
		
		
			
			if (yes.endsWith("D") || yes.endsWith("d")) {
				suit = "of Diamonds";
			}else if (yes.endsWith("H") || yes.endsWith("h")) {
				suit = "of Hearts";
			}else if (yes.endsWith("S") || yes.endsWith("s")) {
				suit = "of Spades";
			}else if (yes.endsWith("C") || yes.endsWith("c")) {   //Find the suit
				suit = "of Clubs";
			}else {
				suit = "illigal suit ";
			}
			return suit;
			}
			
		public String getCard() {
			
			if (yes.substring(0, 1).equalsIgnoreCase("A")) {
				number = "Ace ";
			}else if (yes.substring(0, 1).equalsIgnoreCase("K")) {
				number = "King ";
			}else if (yes.substring(0, 1).equalsIgnoreCase("Q")) {
				number = "Queen ";
			}else if (yes.substring(0, 1).equalsIgnoreCase("J")) {     //Take the first char and find the card
				number = "Jack ";
			}else if (yes.substring(0, 2).equals("10")) {  //First 2 chars
				number = "10 ";
			}else {
				
				try {
					Integer.valueOf(yes.substring(0, 1));   //Make sure it can't break
				} catch(Exception e){
					yes = "0";
				}
				
				if (Integer.valueOf(yes.substring(0, 1)) >= 2 && Integer.valueOf(yes.substring(0, 1)) <= 9) {   //For numbers between 2 and 9
					number = yes.substring(0, 1) + " ";
					
				}else {
				number = "Invalid card ";
				}
			}
			
			return number;
			
			
			
	}

}