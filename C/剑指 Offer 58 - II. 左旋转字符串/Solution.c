// 20210315

// my answer

char* reverseLeftWords(char* s, int n){
    int len = strlen(s);
    char *p = (char*)malloc(sizeof(char)*len + 1);
    // strcpy(p, s+n);
    // C 库函数 char *strcpy(char *dest, const char *src) 把 src 所指向的字符串复制到 dest。需要注意的是如果目标数组 dest 不够大，而源字符串的长度又太长，可能会造成缓冲溢出的情况。
    strncpy(p, s+n, len-n);
    // C 库函数 char *strncpy(char *dest, const char *src, size_t n) 把 src 所指向的字符串复制到 dest，最多复制 n 个字符。当 src 的长度小于 n 时，dest 的剩余部分将用空字节填充。
    strncpy(p+len-n, s, n);
    p[len] = '\0';
    return p;
}