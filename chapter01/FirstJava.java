public class FirstJava {
	public static void main(String[] args) {

	//write code
	
	for(int i = 1;i<=10;i++){
		System.out.println(i);
	}
    	String str1 = "hello";
    	String str2 = "hello";

		System.out.println(str1 == str2);
    	System.out.println(str1.equals(str2));

    	String str3 = new String("world");
   	 	String str4 = new String("world");

			System.out.println(str3 == str4);
    	System.out.println(str3.equals(str4));
	}
}