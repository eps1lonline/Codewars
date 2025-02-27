def expanded_form(dig):
    ptr = ""
    
    for i in range(len(str(dig))):
        prDig = dig // 10**(len(str(dig)) - 1) # get first digit

        if (prDig != 0): # print main digit with a lot of zeroes
            ptr += str(prDig)

            for j in range(len(str(dig)) - 1): # print zeroes
                prDig *= 10
                ptr += "0"

            dig -= prDig # delete first digit
            
            if (dig > 0): # print pluses
                ptr += " + "

    return(ptr)