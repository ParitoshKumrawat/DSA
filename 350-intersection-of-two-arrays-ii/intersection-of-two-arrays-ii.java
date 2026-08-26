class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int num : nums1){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums2){
            if(mp.getOrDefault(num, 0) > 0){
                list.add(num);

                mp.put(num, mp.get(num) - 1);
            }
        }

        int[] res = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++){
           res[i] = list.get(i);
        }

        return res;
    }
}