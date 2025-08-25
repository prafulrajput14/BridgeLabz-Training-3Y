import java.util.*;

class FirstNonRepeat {
    public static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        for(int i=0;i<s.length();i++) if(freq[s.charAt(i)]==1) return s.charAt(i);
        return '\0';
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String t=sc.nextLine();
        char c=firstNonRepeating(t);
        if(c=='\0') System.out.println("No non-repeating character");
        else System.out.println("First non-repeating: "+c);
    }
}
