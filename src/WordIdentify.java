
public class WordIdentify {

	
	public String noun = "";
	
	
	public void nounIdentify(String words){
		String[] textSplit = words.split(" ");
		String text = "";
		
		System.out.println(textSplit[0]);
		for (int i = 0; i < textSplit.length; i++){
			if (textSplit[i].equals("are") || textSplit[i].equals("is") || textSplit[i].equals("was") 
					|| textSplit[i].equals("were") || textSplit[i].equals("will be"))
			{ text = textSplit[i - 1]; }
		}
		
		setNoun(firstPersonPronoun(text));
		//setNoun(noun);
		
	}
	
	public void setNoun(String word){
		this.noun = word;
	}
	
	public String getNoun(){
		return this.noun;
	}
	
	public String firstPersonPronoun(String str){
		String fpp = str;
		if (str.equals("i") || str.equals("I")){
			fpp = "you";
		}
		System.out.println(fpp);
		return fpp;
	}
}
