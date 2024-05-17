package String;

public class StringOccurence {
	public void find_occ_str() {
		String str = "java is Programming Language  Java Supports OOP'S, Java Supports Security";
		String word = "java";
		String s = str.toLowerCase();
		String occ[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < occ.length; i++) {
			if (word.equals(occ[i]))
				count++;
		}
		System.out.println("Original String is: \n" + str + "\n");
		System.out.println("The Word " + word + " occures " + count + " Times in The String ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOccurence oc = new StringOccurence();
		oc.find_occ_str();

	}

}
