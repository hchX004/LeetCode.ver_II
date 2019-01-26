//my answer 100%

class 20190126Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int index = len - 1;
        while((digits[index] += 1) >= 10){
            digits[index] = 0;
            index--;
            if(index == -1){
                int[] temps = new int[len+1];
                for(int i = 1; i < len+1; i++) temps[i] = digits[i-1];
                temps[0] = 1;
                return temps;
            }
        }
        return digits;
    }
}
