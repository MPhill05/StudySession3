
public class revArray {

	public static char[] reverseWords(char[] words) {
		int j = words.length - 1;
		for(int i = 0; i < j; i++) {
			char tmp = words[i];
			words[i] = words[j];
			words[j] = tmp;
			j--;
		}
		
		j = 0;
		for(int i = 0; i < words.length; i++) {
			if(words[i] == ' ') {
				reverse(words, j, i-1);
				j = i + 1;
			}
		}
		
		reverse(words, j, words.length - 1);
		return words;
	}
	
	public static void reverse(char[] arr, int i, int j) {
		while(i < j) {
			char tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			j--;
			i++;
		}
	}
	
	public static void main(String[] args) {
		char[] c = {'T','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		System.out.println(reverseWords(c));
	}
	
}
