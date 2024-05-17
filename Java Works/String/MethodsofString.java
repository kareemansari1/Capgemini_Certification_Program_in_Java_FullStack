package String;

public class MethodsofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Hello ";
		String str2 = "Everyone";
		System.out.println("Length of String is : " + str.length());
		System.out.println("String in Upper Case : " + str.toUpperCase());
		System.out.println("String in Lower Case " + str.toLowerCase());
		System.out.println("String is Equals Ignore Case : " + str.contentEquals(str2));
		System.out.println("String is Equals : " + str.equals(str2));
		System.out.println("String is concat : " + str.concat(str2));
		System.out.println("String Index of : " + str.indexOf(0, 0));
		System.out.println("Strinng last Index Of : " + str.lastIndexOf(str2));
		System.out.println("String Trim is : " + str.trim());

	}

}
