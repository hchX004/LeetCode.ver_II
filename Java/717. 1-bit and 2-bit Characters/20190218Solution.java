//my answer

class 20190218Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length, i;
        for(i = 0; i < len-1;){
            if(bits[i] == 0) i++;
            else i += 2;
        }
        if(i == len) return false;
        else return true;
    }
}

//best answer

/*
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1) return true;
        int count = 0;
        for(int i = bits.length - 2; i >= 0; i--){
            if(bits[i] == 0) break;
            else count++;
        }
        if(count%2 == 0) return true;
        else return false;
    }
}
*/