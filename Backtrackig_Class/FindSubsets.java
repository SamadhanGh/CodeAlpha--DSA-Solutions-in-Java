package Backtrackig_Class;

public class FindSubsets {

    public static void FindSubset(String str, String ans , int i) {
            //Base Case
            if (i == str.length()) {
                if (ans.length() == 0) {
                    System.out.println("null");
                }else{

                    System.out.println(ans);
                }
                return;


            }
        //recursion
        // Yes Choice
        FindSubset(str,ans+str.charAt(i),i+1);
        //No Choice
        FindSubset(str,ans,i+1);

    }

    public static void main(String[] args) {

        String str = "abc";
        FindSubset(str, "", 0);
    }
}
