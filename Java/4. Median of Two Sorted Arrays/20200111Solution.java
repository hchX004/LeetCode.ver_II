//my answer


class 20200111Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums;
    	int m = nums1.length, n = nums2.length;
    	nums = new int[m + n];
    	//判断某个数组为空的情况
    	if (m == 0 && n%2 == 0) return (nums2[n/2-1] + nums2[n/2])/2.0;
        else if(m == 0 ) return nums2[n/2];
    	if (n == 0 && m%2 == 0) return (nums1[m/2-1] + nums1[m/2])/2.0;
        else if(n == 0) return nums1[m/2];
        //开始合并
    	int count = 0;
    	int i = 0, j = 0;
    	while (count != m+n) {
        	if (i == m) {
            	while (j != n) nums[count++] = nums2[j++];
            	break;
        	}
        	if (j == n) {
            	while (i != m) nums[count++] = nums1[i++];
            	break;
        	}

        	if (nums1[i] < nums2[j]) nums[count++] = nums1[i++];
			else nums[count++] = nums2[j++];
    	}
    	//判断合并后的数组数量为奇或偶
    	if (count % 2 == 0) return (nums[count /2-1] + nums[count/2])/2.0;
  		else return nums[count/2];
    }
}


/*
//时间复杂度O(m+n)
//空间复杂度O(1)
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length;
    int n = nums2.length;
    int len = m + n;
    int left = -1, right = -1;
    int aStart = 0, bStart = 0;
    for (int i = 0; i <= len / 2; i++) {
    	//保留前次循环的结果
        left = right;
        if (aStart < m && (bStart >= n || nums1[aStart] < nums2[bStart])) {
            right = num1[aStart++];
        } else {
            right = nums2[bStart++];
        }
    }
    if ((len & 1) == 0)
        return (left + right) / 2.0;
    else
        return right;
}

//二分查找
//时间复杂度O(log(min(m,n))
//空间复杂度O(1)
public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        //将长短数组排序
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        //A为短数组，B为长数组
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        //用i和j将两个数组划分找到中位数
        //i + j = m-i + n-j + 1
        //B[j-1] > A[i], A[i-1] > B[j]
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            //找到合适的i
            else {
            	//判断奇偶得到中位数
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
 */