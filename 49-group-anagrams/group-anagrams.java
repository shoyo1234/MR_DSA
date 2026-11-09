class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Creaing HashMap to store sorted key
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            //Convert word to character array
            char[] arr = word.toCharArray();
            //Sort the string to generate key
            Arrays.sort(arr);
            //Generate key
            String key = new String(arr);
            //Check if key exits in the map else generate new List
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}