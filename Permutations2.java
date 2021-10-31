/*47. Permutations II
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 
Constraints:
1 <= nums.length <= 8
-10 <= nums[i] <= 10*/

public void traverse(List<List<Integer>> resultList, List<Integer> current, int[] nums, boolean[] used) {
	if( current.size() == nums.length )
		resultList.add(new ArrayList<Integer>(current));
	else{
		for(int i = 0; i < nums.length; i++) {
			if( used[i] || ( i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) ) // remove duplicate
				continue;
			current.add(nums[i]);
			used[i] = true;
			traverse(resultList, current, nums, used);
			used[i] = false;
			current.remove(current.size() - 1);
		}
	}
}

public List<List<Integer>> permuteUnique(int[] nums) {
	Arrays.sort(nums); // sort is necessary
	List<List<Integer>> resultList = new ArrayList<List<Integer>>();
	traverse(resultList, new ArrayList<Integer>(), nums, new boolean[nums.length]);
	return resultList;
}