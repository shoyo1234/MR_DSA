class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // To store all elemets for checking if they exit or not and to remove duplication
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        } 
        //Array List to store result
        List<Integer> result = new ArrayList<>();
        for(int i =1; i <= nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}