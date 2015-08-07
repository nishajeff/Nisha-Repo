
public class ShufflingCards {
	private String[] cards;
	
	public ShufflingCards(){
		cards=new String[4];	
	}
	public void setCards(int place){				
		cards[place]="AA";				
		for(int i=1;i<cards.length;i++){
			if(cards[i]==null)
				cards[i]="#";	
			}
	}
	public String[] getCards(){
		return cards;
	}
	public String toString(){
		String out = null;
		for(int i=1;i<cards.length;i++)
			out=cards[i]+"     ";
		return out;
	}

}
