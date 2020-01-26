class 20200126Solution {
    public int hammingDistance(int x, int y) {
        int bin = x ^ y, distance = 0;              //按位异或
        while(bin != 0){
            distance += bin & 1;
            bin = bin >> 1;
        }
        return distance;
    }
}

/*
class Solution {
	public int hammingDistance(int x, int y) {
		uint32_t z = x ^ y;
		z = (z & 0x55555555) + ((z >> 1) & 0x55555555);
		z = (z & 0x33333333) + ((z >> 2) & 0x33333333);
		z = (z & 0x0f0f0f0f) + ((z >> 4) & 0x0f0f0f0f);
		z = (z & 0x00ff00ff) + ((z >> 8) & 0x00ff00ff);
		z = (z & 0x0000ffff) + ((z >> 16) & 0x0000ffff);
		return (int)z;
	}
}
 */