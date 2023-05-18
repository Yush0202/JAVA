public class Solution {

    public String smallest(String[] strs) {
        String first = strs[0];
        for (int i=1;i<strs.length; i++) {
            if ((strs[i].compareTo(first))<0) {
                first=strs[i];
            }
        }
        return first;
    }

    public String longestCommonPrefix(String[] strs) {
        String s=smallest(strs);
        for(int i=0;i<strs[0].length();i++){
            char x=strs[0].charAt(i);
            for(int j=0;j<s.length();j++){
                if(strs[j].charAt(i)!=x)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
    public static void main(string[] args){
        String[] strs={"flower","flow","flight"};
        longestCommonPrefix(strs);

    }
}