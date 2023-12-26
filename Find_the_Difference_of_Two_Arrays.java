//Approach 1

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int num: nums1) 
            set1.add(num);

        for(int num: nums2) 
            set2.add(num);

        Set<Integer> ans1 = new HashSet<>();
        for(int num: nums1) {
            if(set2.contains(num) == false) {
                ans1.add(num);
            }
        }

        Set<Integer> ans2 = new HashSet<>();
        for(int num: nums2) {
            if(set1.contains(num) == false) {
                ans2.add(num);
            }
        }

        return Arrays.asList(new ArrayList<>(ans1), new ArrayList<>(ans2));
    }
}
