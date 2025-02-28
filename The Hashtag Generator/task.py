def generate_hashtag(str):
    if str == '' or str == ' ':
        return False

    str = str.split(' ')
    result = '#'

    for i in str:
        if i.istitle() == False:
            i = i.capitalize()
        result += i

    if len(result) > 140:
        return False

    return result