// 20190219

// my answer

class Solution {
    public String intToRoman(int num) {
        String res = "";
        
        int figure = num / 1000;
        num %= 1000;
        for(int i = 0; i < figure; i++) res += "M";
        
        figure = num / 100;
        num %= 100;
        if(figure < 4)
            for(int i = 0; i < figure; i++) res += "C";
        else if(figure == 4)
            res += "CD";
        else if(figure == 5)
            res += "D";
        else if(figure == 9)
            res += "CM";
        else{
            res += "D";
            for(int i = 0; i < figure-5; i++) res += "C";
        }
        
        figure = num / 10;
        num %= 10;
        if(figure < 4)
            for(int i = 0; i < figure; i++) res += "X";
        else if(figure == 4)
            res += "XL";
        else if(figure == 5)
            res += "L";
        else if(figure == 9)
            res += "XC";
        else{
            res += "L";
            for(int i = 0; i < figure-5; i++) res += "X";
        }
        
        figure = num;
        if(figure < 4)
            for(int i = 0; i < figure; i++) res += "I";
        else if(figure == 4)
            res += "IV";
        else if(figure == 5)
            res += "V";
        else if(figure == 9)
            res += "IX";
        else{
            res += "V";
            for(int i = 0; i < figure-5; i++) res += "I";
        }
        
        return res;
    }
}

//best answer

/*
class Solution {
    static String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    static int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            while (num >= value[i]) {
                num -= value[i];
                sb.append(str[i]);
            }
            i++;
        }
        return sb.toString();
    }
}
*/
