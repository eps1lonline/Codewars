class RomanNumerals:
    @staticmethod
    def to_roman(val : int) -> str:
        symbols = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]

        i = 0
        str = ''

        while val != 0:
            flag = True

            if val - values[i] >= 0:
                str += symbols[i]
                val -= values[i]
                flag = False

            if flag:
                i += 1
    
        return str

    @staticmethod
    def from_roman(roman_num : str) -> int:
        symbols = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]

        i = 0
        digit = 0
        srez = 0

        while srez != len(roman_num):
            flag = True

            if roman_num[srez:].find(symbols[i]) != -1 and roman_num[srez:].find(symbols[i]) == 0:
                srez += len(symbols[i])
                digit += values[i]
                flag = False

            if flag:
                i += 1

        return digit