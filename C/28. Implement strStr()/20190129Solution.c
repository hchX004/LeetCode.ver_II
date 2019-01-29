//my answer 100%

void getNext(char* needle, int* next, int len);

int strStr(char* haystack, char* needle) {
    int len = strlen(needle), lenl = strlen(haystack);
    if(len == 0) return 0;
    if(lenl == 0) return -1;
    int next[len];
    getNext(needle, next, len);
    int i = 0, j = 0;
    while(i < lenl && j < len){
        if(haystack[i] == needle[j]){
            i++;
            j++;
            if(j == len) return i-j;
        }
        else {
            if(next[j] == -1){
                i++;
                j = 0;
            }
            else{
                j = next[j];
            }
        }     
    }
    return -1;
}

void getNext(char* needle, int* next, int len){
    int i = 0, k = -1;
    next[0] = -1;
    while(i < len){
        if(k == -1 || needle[k] == needle[i]){
            i++;
            k++;
            next[i] = k;
        }
        else{
            k = next[k];
        }
    }
}

//KMP!!