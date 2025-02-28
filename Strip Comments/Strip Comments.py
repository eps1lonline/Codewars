def strip_comments(s, m):
    ptr = ''
    s = s.split("\n")
    
    for i in s:
        c = 0
        for j in m:
            if i.find(j) != -1:
                i = i[0:i.find(j)]
                c += 1
                
        if c == 0:
            ptr += i
        else:
            ptr += i[0:i.find(j)]
            
        ptr = ptr.rstrip(' ')
        ptr += '\n'
    
    return ptr[:-1]