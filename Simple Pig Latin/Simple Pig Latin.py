def pig_it(s):
    s = s.split(" ")
    ns = ''
    
    for i in range(0, len(s)):
        if s[i] != '!':
            if s[i] != '?':
                s[i] += s[i][0] + 'ay'
                s[i] = s[i][1:]
        ns += s[i] + ' '

    return ns[:-1]