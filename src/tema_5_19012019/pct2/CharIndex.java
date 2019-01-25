package tema_5_19012019.pct2;

public class CharIndex {

	private String str;
	private char chr;
	
	public CharIndex() {
		
	}
	public CharIndex(String str, char c) {
		this.str = str;
		this.chr = c;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public char getChr() {
		return chr;
	}

	public void setChr(char c) {
		this.chr = c;
	}
	
	public int checkIndex(CharIndex f) {
		
		int i=0;
		int index=0;
		while(i<=(f.getStr().length()-1)) {
			if(f.getStr().charAt(i)==f.getChr()) {
				index=i;
				break;
			}
			else {
				i++;
			}
		}
		return index;
		
	}
	
	

}
