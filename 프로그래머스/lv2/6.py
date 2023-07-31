# 이진 변환 반복하기

def solution(s): 
    answer = []
    cnt = 0
    k = 0
    while s!="1":
        ans = []
        x = s.count("1")
        cnt += len(s) - x
        while x>0:
            ans.append(x%2)
            x = x//2
        s = ''
        answer.reverse()
        for elem in ans:
            s += str(elem)
        k += 1
    answer.append(k)
    answer.append(cnt)
    
        
    return answer