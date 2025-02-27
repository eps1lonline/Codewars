def make_readable(digit):
    str = lenValue(digit // 3600) + ":" + lenValue((digit % 3600) // 60) + ":" + lenValue(digit % 60)
    return str

def lenValue(value):
    if len(str(value)) < 2:
        return str(str(value).zfill(2))
    else:
        return str(value)