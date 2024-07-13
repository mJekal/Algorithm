def solution(myString):
    answer = ''
    alpha = ['a','b','c','d','e','f','g','h','i','j','k']
    for i in myString:
        if i in alpha:
            answer+="l"
            continue
        answer += i
    return answer