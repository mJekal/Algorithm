#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	int N, X, K;
	scanf("%d %d", &N,  &X);

	for (int i = 0; i < N; i++) {
		scanf("%d", &K);
		if (K < X) {
			printf("%d ", K);
		};
	};

	return 0;

}


