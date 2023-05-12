public class Cipherer implements Encryptinterface{
	private String plaintext;
	private String encrypted;
	private String decrypted;
	private boolean isEncrypted;

	public Cipherer(String sentence){
		plaintext = sentence;
		isEncrypted = false;
	}
	public void encrypt(){
		if(!isEncrypted){
			for(int i = 0; i < plaintext.length(); i++){
				char c = plaintext.charAt(i);
				if(Character.isUpperCase(c)){
					c = (char)('Z' - (c - 'A'));
				}else{
					c = (char)('Z' - (c - 'A'));
				}
				encrypted += c;
				isEncrypted = true;
			}
		}
	}
	public String decrypt(){
		if(isEncrypted){
			for(int i = 0; i < plaintext.length(); i++){
				char c = plaintext.charAt(i);
				if(Character.isUpperCase(c)){
					c = (char)('Z' - (c - 'A'));
				}else{
					c = (char)('Z' - (c - 'A'));
				}
				decrypted += c;
				isEncrypted = false;
			}
		}
		return decrypted;
	}
	public String isEncrypted(){
		return encrypted;
	}
	public String toString() {
		return encrypted;
	}
}
