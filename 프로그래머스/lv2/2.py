# JadenCase 문자열 만들기

def solution(s):
    answer = []
    s = s.split(" ")
    for elem in s:
        if elem:
            answer.append(elem[0].upper() + elem[1:].lower())
        else:
            answer.append(elem)
    return " ".join(answer)

print(solution("3people unFollowed me for the last week"))
