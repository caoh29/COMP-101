public class JavaCodeTester2 {
  public static void main(String[] args) {

    String str1 = "Hello";
    String str2 = "World";
    String str3 = "Camilo";

    String strFinal = str1 + str2 + str3;
    System.out.println("Character 3 of the final string is " + strFinal.charAt(2));
    System.out.println("Character 5 of the final string is " + strFinal.charAt(4));
    System.out.println("Character 7 of the final string is " + strFinal.charAt(6));

    System.out.println("Does the final string starts with 'test'?: " + strFinal.startsWith("test"));

    System.out.println("Final string in Uppercase is: " + strFinal.toUpperCase());

    int number = 25;
    System.out.println(++number);
    System.out.println(number++);
  }
}
