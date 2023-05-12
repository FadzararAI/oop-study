public class Cipherer implements Encryptinterface{
	private String sentence;
	private boolean isEncrypted;

	public Cipherer(String message){
		sentence = message;
		isEncrypted = false;
	}
	public void encrypt(){
		if(!isEncrypted){
			String encrypted = "";
			for(int i = 0; i < sentence.length(); i++){
				char c = sentence.charAt(i);
				if(Character.isUpperCase(c)){
					c = (char)('Z' - (c - 'A'));
					encrypted += c;
				}else{
					c = (char)('z' - (c - 'a'));
					encrypted += c;
				}
			}
			sentence = encrypted;
			isEncrypted = true;
		}
	}
	public String decrypt(){
		if(isEncrypted){
			String decrypted = "";
			for(int i = 0; i < sentence.length(); i++){
				char c = sentence.charAt(i);
				if(Character.isUpperCase(c)){
					c = (char)('Z' - (c - 'A'));
					decrypted += c;
				}else{
					c = (char)('z' - (c - 'a'));
					decrypted += c;
				}
			}
			sentence = decrypted;
			isEncrypted = false;
		}
		return sentence;
	}
	public String isEncrypted(){
		return sentence;
	}
	public String toString() {
		return sentence;
	}
}
