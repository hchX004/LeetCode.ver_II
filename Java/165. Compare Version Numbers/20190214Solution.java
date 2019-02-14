//My answer

class 20190214Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1Array = version1.split("\\.");
        String[] ver2Array = version2.split("\\.");
        int num1 = ver1Array.length;
        int num2 = ver2Array.length;
        int num, d;
        if((d = num1 - num2) > 0){
            ver2Array = Arrays.copyOf(ver2Array, ver2Array.length + d);
            num = ver1Array.length;
            for(int i = num2; i < num; i++) ver2Array[i] = "0";
        }
        else if((d = num2 - num1) > 0){
            ver1Array = Arrays.copyOf(ver1Array, ver1Array.length + d);
            num = ver2Array.length;
            for(int i = num1; i < num; i++) ver1Array[i] = "0";
        }
        else num = num1;
        for(int i = 0;i < num; i++){
            if(Integer.valueOf(ver1Array[i]) > Integer.valueOf(ver2Array[i])) return 1;
            else if(Integer.valueOf(ver1Array[i]) < Integer.valueOf(ver2Array[i])) return -1;
        }
        return 0;
    }
}

//Best answer
/*
class Solution {
    public int compareVersion(String version1, String version2) {
        return compareSameLevel(version1,0,version2,0);
    }

    private int compareSameLevel(String version1, int index1 ,String version2,int index2) {
        if(index1 >= version1.length() && index2 >= version2.length())
            return 0;
        int p1 = index1;
        int p2 = index2;
        int num1 = 0;
        int num2 = 0;
        while (p1 < version1.length() && version1.charAt(p1)!='.'){
            num1 = num1 * 10 +(version1.charAt(p1) -'0');
            p1++;
        }
        while (p2 < version2.length() && version2.charAt(p2)!='.'){
            num2 = num2 * 10 +(version2.charAt(p2) -'0');
            p2++;
        }
        if(num1 < num2) return -1;
        if(num1 > num2) return 1;
        return compareSameLevel(version1,++p1,version2,++p2);
    }
}
*/