


class 20200201Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char[] chs = moves.toCharArray();
        for(char ch : chs){
            if(ch == 'R') x += 1;
            else if(ch == 'L') x -= 1;
            else if(ch == 'U') y += 1;
            else if(ch == 'D') y -= 1;
        }
        if(x == 0 && y == 0) return true;
        return false;
    }
}


/*
class Solution {
    public boolean judgeCircle(String moves) {
        int[] move = new int[128];
        for(char c : moves.toCharArray())
            move[c]++;
        return move['U'] == move['D'] && move['L'] == move['R'];

    }
}
 */