// 20200302

// my answer

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
        int flag = 1;
        Arrays.sort(deck);
        for(int i = 0, p = 0; i < deck.length; i++){
            while(flag < 2) flag += ans[(p++) % deck.length] == 0 ? 1 : 0;
            ans[(p - 1) % deck.length] = deck[i];
            flag = 0;
        }
        return ans;
    }
}