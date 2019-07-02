class Solution {
    /* Brute force method
    * time: O(nm)
    */
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int j = 0; j<J.length(); j++) {
            for (int s = 0; s<S.length(); s++) {
                char jew = J.charAt(j);
                char st = S.charAt(s);
                if (jew==st) result++;
            }
        }
        return result;
    }
}