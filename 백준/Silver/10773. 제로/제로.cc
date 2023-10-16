#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int* arr;
	int capacity;
	int top;
} Stack;

Stack* createStack(int max) {
	Stack* S = (Stack*)malloc(sizeof(Stack));
	S->arr = (int*)malloc(sizeof(int) * max);
	S->capacity = max;
	S->top = -1;
    return S;
};

int IsEmpty(Stack* S) {
	return S->top == -1;
}

int IsFull(Stack* S) {
	return S->top == S->capacity - 1;
}

void Push(int x, Stack* S) {
	S->arr[++S->top]=x;
}

int Pop(Stack* S) {
	return S->arr[S->top--];
}

int main() {
	int num,x;
	scanf("%d", &num);
	Stack* stack = createStack(num);
	int sum = 0;
	for (int i = 0; i < num; i++) {
		scanf("%d", &x); 
		if (x != 0) {
			Push(x, stack);
		}
		else { Pop(stack); }
	}
	for (int i = 0; i <= stack->top; i++) {
		sum += stack->arr[i];
	}
	printf("%d", sum);
	free(stack->arr);
	free(stack);
	return 0;
}