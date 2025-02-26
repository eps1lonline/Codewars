def funct_1(p, a, circle, count, expected):
    for j in range(p, len(a) - circle):
        expected.append(a[p][j])
        count += 1
    if count == len(a)**2:
        return expected

    for i in range(p + 1, len(a) - circle):
        expected.append(a[i][j])
        count += 1

    return funct_2(i, a, circle, count, expected)

def funct_2(p, a, circle, count, expected):
    for j in range(p - 1, -1 + circle, -1):
        expected.append(a[p][j])
        count += 1
    if count == len(a)**2:
        return expected

    circle += 1
    for i in range(p - 1, -1 + circle, -1):
        expected.append(a[i][j])
        count += 1
    
    return funct_1(i, a, circle, count, expected)

def snail(a):
    if a == [[]]:
        return []
    
    circle = 0
    count = 0
    expected = []
    result = funct_1(0, a, circle, count, expected)
    return result