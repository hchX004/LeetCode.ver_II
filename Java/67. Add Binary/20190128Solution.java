//my answer

class 20190128Solution {
   public String addBinary(String a, String b) {
        String result = "";
        char[] charAs = a.toCharArray(), charBs = b.toCharArray();
        int c = 0, temp = 0, lenA = charAs.length, lenB = charBs.length;
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i = lenA-1, j = lenB-1; i >= 0 || j >= 0; i--, j--){
            if(i >= 0 && j >= 0 && (temp = charAs[i]-'0' + charBs[j]-'0' + c) < 2){
                sum.add(temp);
                c = 0;
            } else if(i >= 0 && j < 0 && (temp = charAs[i]-'0' + c) < 2){
                sum.add(temp);
                c = 0;
            } else if(i < 0 && j >= 0 && (temp = charBs[j]-'0' + c) < 2){
                sum.add(temp);
                c = 0;
            } else {
                if(temp == 2) sum.add(0);
                else sum.add(1);
                c = 1;
            }
        }
        if(c == 1) sum.add(1);
        for(int i = sum.size()-1; i >= 0; i--)
            result += sum.get(i);
        return result;
    }
}
