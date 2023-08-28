import java.net.*;
import java.util.*;
import java.io.*;
public class palinServer{
	public static boolean isPalindrome(String str) {
        // str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }
	public static void main(String [] args){
		try{
			ServerSocket ss = new ServerSocket(90);
			Socket s = ss.accept();

			Scanner sc = new Scanner(s.getInputStream());
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

			String str = sc.nextLine();
			if(isPalindrome(str)){
				pw.println(str+" is a palindrome");
			}else{
				pw.println(str+" is not palindrome!!");
			}

			pw.close();
			sc.close();
			s.close();
			ss.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}