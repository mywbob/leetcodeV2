class Solution {
    /*
    *bottom up build permutation
    */
    /*
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);
        lists.add(list);
        results= lists;
        for (int i = 1; i<nums.length; i++) {
            int newValue = nums[i];
            results = new ArrayList<List<Integer>>();
            for (int row = 0; row<lists.size(); row++) {
                for (int col = 0; col<=lists.get(row).size(); col++) {
                    List<Integer> listCopy = new ArrayList<Integer>(lists.get(row));
                    listCopy.add(col, newValue);
                    results.add(listCopy);
                }
            }
            lists = new ArrayList<List<Integer>>(results);
        }

        return results;
    }
    */
    
    /*
    *recur
    */
    public List<List<Integer>> permute(int[] nums) {
        return permute(0, nums.length-1, nums);
    }
    
    public List<List<Integer>> permute(int s, int e, int[] nums) {
        if (s >= e) {
            List<List<Integer>> lists = new ArrayList<List<Integer>>();
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[e]);
            lists.add(list);
            return lists;
        }
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<List<Integer>> sub = permute(s+1, e, nums);
        for (int row = 0; row<sub.size();row++) {
            for (int col=0; col<=sub.get(row).size(); col++) {
                List<Integer> listCopy = new ArrayList<Integer>(sub.get(row));
                listCopy.add(col, nums[s]);
                results.add(listCopy);
            }
        }
        return results;
    }
}