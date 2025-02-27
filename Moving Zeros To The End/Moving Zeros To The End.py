def move_zeros(a):
    nA = []

    count = 0
    for i in range(0, len(a)):
        if a[i] == 0:
            count +=1
        else:
            nA.append(a[i])

    for i in range(0, count):
        nA.append(0)
        
    return nA