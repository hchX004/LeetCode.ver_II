//my answer


class 20200101Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode sortedArrayToBST(int[] nums){
		if(nums == null || nums.length == 0) return null;
		return splitInMid(nums, 0, nums.length-1);
	}

	private TreeNode splitInMid(int[] nums, int start, int end){
		if(start > end) return null;
		int mid = start + (end - start)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = splitInMid(nums, start, mid-1);
		node.right = splitInMid(nums, mid+1, end);
		return node;
	}
}
