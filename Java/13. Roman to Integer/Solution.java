// 20190118

// my answer

class Solution {
    public int romanToInt(String s) {
        int result = 0, index = 0;
        boolean flag = false;
        char[] romanChs;
        romanChs = s.toCharArray();
        int length = romanChs.length;
        for(char romanCh: romanChs){
            if(flag){
                index++;
                flag = false;
                continue;
            }   
            switch(romanCh){
                case 'I':
                    if(index+1 < length && romanChs[index+1] == 'V'){
                        result += 4;
                        flag = true;
                    }
                    else if(index+1 < length && romanChs[index+1] == 'X'){
                        result += 9;
                        flag = true;
                    }
                    else result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if(index+1 < length && romanChs[index+1] == 'L'){
                        result += 40;
                        flag = true;
                    }
                    else if(index+1 < length && romanChs[index+1] == 'C'){
                        result += 90;
                        flag = true;
                    }
                    else result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if(index+1 < length && romanChs[index+1] == 'D'){
                        result += 400;
                        flag = true;
                    }
                    else if(index+1 < length && romanChs[index+1] == 'M'){
                        result += 900;
                        flag = true;
                    }
                    else result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    return 0;
            }
            index++;
        }
        return result;
    }
}

//good answer

/*
class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        char[] roman = s.toCharArray();
        int romanLength = roman.length;
        int sum = 0;
        while (romanLength > 0) {
            int prior = 0;
            int current = map.get(String.valueOf(roman[romanLength - 1]));
            if (romanLength == 1) {
                prior = current;
            } else {
                prior = map.get(String.valueOf(roman[romanLength - 2]));
            }
            if (prior < current) {
                sum = sum + current - prior;
                romanLength = romanLength - 2;
            } else {
                sum += current;
                romanLength--;
            }
        }
        return sum;
    }
}
*/