def solution(args):
    s = ""
    i = 0
    
    while True:
        if i == len(args):
            break
        
        r = 0
        
        for j in range(i, len(args)):
            if j == len(args) - 1:
                break
                
            if abs(args[j] - args[j + 1]) == 1:
                r += 1
            else:
                break

        if r >= 2:
            s += str(args[i]) + "-" + str(args[i + r]) + ","
        elif r == 0:
            s += str(args[i]) + ","
        elif r == 1:
            s += str(args[i]) + ","
            r -= 1
        
        i += r
        i += 1

    return s[:-1]