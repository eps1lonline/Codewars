from collections import Counter

def score(mass):
    splitMass = Counter(mass)
    sum = 0

    for el in splitMass:
        if (splitMass[el] >= 3):
            if (el == 1):
                sum += (splitMass[el] // 3) * 1000
            else:
                sum += (splitMass[el] // 3) * 100 * el
            splitMass[el] %= 3

    for el in splitMass:
        if (el == 1):
            sum += splitMass[el] * 100
        elif (el == 5):
            sum += splitMass[el] * 50

    return(sum)