import numpy as np

s = "2000 10003 1234000 44444444 9999 11 11 22 123"
newS = s.split(" ")

massSum = np.zeros(len(newS))
count = 0
for i in newS:
    sum = 0
    for j in range(0, len(i)):
        sum += int(i[j])
    massSum[count] = sum
    count += 1

output = ""
massSum = sorted(list(set(massSum)))
my_list = []
for i in massSum:
    my_list.clear()
    for j in newS:
        sum = 0
        for k in range(0, len(j)):
            sum += int(j[k])

        if sum == i:
            my_list.append(j)
        if len(my_list) > 1:
            my_list = sorted(my_list)

    for n in my_list:
        output += n + " "

print(output[:-1])
