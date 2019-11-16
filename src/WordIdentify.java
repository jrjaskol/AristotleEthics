
public class WordIdentify {

//	String words = "1";
//	
//	public WordIdentify(String str){
//		words = str;
//	}
	
	
	
	public String nounIdentify(String words){
		String[] textSplit = words.split(" ");
		String noun = "";
		
		System.out.println(textSplit[0]);
		for (int i = 0; i < textSplit.length; i++){
			if (textSplit[i].equals("are")) { noun = textSplit[i - 1]; }
		}
		
		return noun;
		
	}
}
