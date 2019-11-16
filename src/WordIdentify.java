
public class WordIdentify {

	String words = "1";
	
	public WordIdentify(String str){
		words = str;
	}
	
	String[] textSplit = words.split(" ");
	
	public String nounIdentify(){
		String noun = "2";
		System.out.println(textSplit[0]);
		for (int i = 0; i < textSplit.length; i++){
			if (textSplit[i].equals("are")) { noun = textSplit[i - 1]; }
			System.out.println(textSplit[i]);
		}
		
		System.out.println(noun);
		return noun;
		
	}
}
