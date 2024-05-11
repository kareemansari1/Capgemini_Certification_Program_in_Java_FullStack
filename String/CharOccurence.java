package String;

public class CharOccurence {
	public void find_occ_char() {
		char cha[] = { 'A', 'B', 'C', 'D', 'A', 'B' };
		char letter = 'A';
		int count = 0;
		String string = new String(cha);
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'A') {
				count++;
			}
		}
		System.out.println("The Letter "+letter+" is Repeated in " +count+ " Times in Array");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharOccurence co = new CharOccurence();
		co.find_occ_char();
	}

}
	