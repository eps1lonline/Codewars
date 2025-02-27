def format_duration(seconds):
    if seconds == 0:
        return "now"
    
    massDigit = []
    massString = ["", "", "", "", ""]
    count = 0

    y = seconds // (365 * 86400)
    massDigit.append(y)
    massString = funct(y, "year", "years", count, massString)
    count += 1

    d = (seconds % (365 * 86400)) // 86400
    massDigit.append(d)
    massString = funct(d, "day", "days", count, massString)
    count += 1

    h = (seconds % 86400) // 3600
    massDigit.append(h)
    massString = funct(h, "hour", "hours", count, massString)
    count += 1

    m = (seconds % 3600) // 60
    massDigit.append(m)
    massString = funct(m, "minute", "minutes", count, massString)
    count += 1

    s = seconds % 60
    massDigit.append(s)
    massString = funct(s, "second", "seconds", count, massString)

    string = ""
    for i, el in enumerate(massDigit):
        if el != 0:
            string += str(el) + " " + massString[i]

        if el != 0:
            count = 0
            for j in range(i + 1, len(massDigit)):
                if massDigit[j] != 0:
                    count += 1
            if count > 1:
                string += ", "
            elif count == 1:
                string += " and "

    return string

def funct(digit, value1, value2, count, mass2):
    if digit == 1:
        mass2[count] = value1
    elif digit > 1:
        mass2[count] = value2
    return mass2