class Solution {
    public int distributeCandies(int[] candyType) {
        // int maxCandies = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n: candyType){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        if(map.size() >= (candyType.length/2))return candyType.length / 2;

        return map.size();
    }
}