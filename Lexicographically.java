package leetCodePalindrome;

public class Lexicographically {
	
	    public String answerString(String word, int numFriends) {
	        if (numFriends == 1) {
	            return word;
	        }
	        String res = "";
	        int maxLength = word.length() - numFriends + 1;
	        for (int i = 0; i < word.length(); i++) {
	            String curr = word.substring(i, Math.min(word.length(), i + maxLength));
	            if (curr.compareTo(res) > 0) {
	                res = curr;
	            }
	        }
	        return res;
	    }
	}


