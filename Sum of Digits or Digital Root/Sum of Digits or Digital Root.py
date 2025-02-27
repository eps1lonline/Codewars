def digital_root(n):
    while len(str(n)) > 1:
        sum = 0
        for i in range(len(str(n))):
            sum += n % 10
            n //= 10
        n = sum
    return(n)