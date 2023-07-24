# 문자열 내 p와 y의 개수

def solution(s):
    answer = False
    countP = 0
    countY = 0
    for elem in s:
        if elem == "P" or elem == "p":
            countP += 1
        if elem == "Y" or elem == "y":
            countY += 1
    if countP == countY:
        answer = True
    if countP == 0 and countY == 0:
        aanswer = True

    return answer