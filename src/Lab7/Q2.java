package Lab7;

public class Q2 {
    public static void main(String[] args){
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String s){
        MyQueue<Character> q=new MyQueue<>();
        for(int i=0;i<s.length();i++){
            q.enqueue(s.charAt(i));
        }

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != q.dequeue())
                return false;
        }

       return true;
    }
}
