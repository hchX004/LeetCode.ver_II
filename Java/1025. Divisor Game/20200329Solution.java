


class 20200329Solution {
    public boolean divisorGame(int N) {
        if(N == 1) return false;
        if(N == 2) return true;

        boolean[] flags = new boolean[N + 1];
        flags[1] = false;
        flags[2] = true;

        for(int i = 3; i <= N ; i++){
            flags[i] = false;
            for(int j = i - 1; j > 0; j--){			//int j = 1; j < i; j++		-3ms
                if(i % j == 0 && !flags[i - j]){
                    flags[i] = true;
                    break;
                }
            }
        }

        return flags[N];
    }
}


/*
public boolean divisorGame(int N) {
	return N % 2 == 0;
}
 */