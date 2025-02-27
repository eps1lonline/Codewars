def sum_strings(x, y):
    x = x.zfill(len(y))
    y = y.zfill(len(x))

    carry = 0
    result = []

    for i in range(len(x) - 1, -1, -1):
        sum = int(x[i]) + int(y[i]) + carry
        carry = sum // 10
        result.append(str(sum % 10))

    if carry:
        result.append(str(carry))
    
    return ''.join(result[::-1]).lstrip('0') or '0'