import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        boolean isPalindrome=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String string1 = scanner.nextLine();
        System.out.println("You entered: " + string1);
        //String string1="A man, a plan, a canal: Panama";  //for testing only
        string1=string1.toLowerCase();
        string1=string1.replace(" ","");
        string1=string1.replace(",","");
        string1=string1.replace(":","");
        System.out.println("String1 : "+string1);

        int detector=string1.length()-1;
        for(int i=0;i<detector;i++){
                if(string1.charAt(i)==string1.charAt(detector)){
                    isPalindrome=true;
                    break;
                }
                    if (string1.charAt(i) !=detector) {
                        isPalindrome = false;
                        break;
                    }
                    detector--;
                }

        if(isPalindrome){
            System.out.println("True...The string is a palindrome");
        }
        else{
            System.out.println("False...The string is not a palindrome");
        }
    }
}
