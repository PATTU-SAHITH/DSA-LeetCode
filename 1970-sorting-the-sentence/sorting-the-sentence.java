class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];

        for(String sm: words){
            char c = sm.charAt(sm.length()-1);
            int n = c - '0';
            sm = sm.substring(0,sm.length()-1);
            arr[n-1]=sm;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}