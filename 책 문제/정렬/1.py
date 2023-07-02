# 선택정렬

array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(array)):
    min_value = i
    for j in range(i+1, len(array)):
        if array[min_value] > array[j]:
            min_value = j
    array[i], array[min_value] = array[min_value], array[i]

print(array)
