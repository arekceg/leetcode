package strings.longestcommonprefix;

public class LongestCommonPrefix_solution {
    public static String longestCommonPrefix(String[] strs) {
        var prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
