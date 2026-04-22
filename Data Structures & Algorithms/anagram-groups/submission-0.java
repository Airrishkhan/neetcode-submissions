

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            // Reset frequency array for each word
            int[] arr = new int[26];

            for (int j = 0; j < strs[i].length(); j++) {
                arr[strs[i].charAt(j) - 'a']++;
            }

            // Correct key creation
            String key = Arrays.toString(arr);

            // Put if absent, then add
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(strs[i]);
        }

        return new ArrayList<>(hm.values());
    }
}