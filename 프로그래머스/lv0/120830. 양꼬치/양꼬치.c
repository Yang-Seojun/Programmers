#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
int J = n/10;
    int answer = (12000*n) + (2000*k) - (2000*J);
    return answer;
}