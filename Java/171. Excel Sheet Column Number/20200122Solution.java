//my answer


//26进制转10进制
class 20200122Solution {
	public int titleToNumber(String s) {
		int ans = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			int num = s.charAt(i) - 'A' + 1;
			ans = ans * 26 + num;
		}
		return ans;
	}
}