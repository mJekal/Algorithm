#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int* arr;
    int top;
    int capacity;
} Stack;

Stack* CreatStack(int maxElement) {
    Stack* S = (Stack*)malloc(sizeof(Stack));
    S->arr = (int*)malloc(maxElement * sizeof(int));
    if (S->arr == NULL) {
        free(S);
        exit(1);
    }
    S->capacity = maxElement;
    S->top = -1;
    return S;
}

int isEmpty(Stack* S) {
    return S->top == -1;
}

int isFull(Stack* S) {
    return S->top == S->capacity - 1;
}

void Push(int x, Stack* S) {
    S->arr[++S->top] = x;
}

int Pop(Stack* S) {
    if (!isEmpty(S)) {
        return S->arr[S->top--];
    }
    return -1;
}

int main() {
    int num, order, x;
    scanf("%d", &order);
    Stack* stack = CreatStack(order);

    for (int i = 0; i < order; i++) {
        scanf("%d", &num);
        if (num == 1) {
            scanf("%d", &x);
            Push(x, stack);
        }
        if (num == 2) {
            printf("%d\n", Pop(stack));
        }
        if (num == 3) {
            printf("%d\n", stack->top + 1);
        }
        if (num == 4) {
            printf("%d\n", isEmpty(stack));
        }
        if (num == 5) {
            if (!isEmpty(stack)) {
                printf("%d\n", stack->arr[stack->top]);
            }
            else {
                printf("-1\n");
            };
        }
    }

    free(stack->arr);
    free(stack);

    return 0;
}
