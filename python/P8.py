def myAtoi(str):
    '''
    1. plus or minus sign.
    2. input should only have the numbers, no char.
    3. if the char behind all the integers, then we can ignore it.
    4. if the conversion expend the length, we need change it.
    5. whitespaces will be fine
    '''
    # swithers
    switcher = {
      '0' : 0,
      '1' : 1,
      '2' : 2,
      '3' : 3,
      '4' : 4,
      '5' : 5,
      '6' : 6,
      '7' : 7,
      '8' : 8,
      '9' : 9,
    }
    i = 0
    result = 0
    si = 1
    if str=='':
        return 0
    while str[i]==' ':
        i += 1
    if (str[i] == '-'):
    	si = -1
    	i += 1
    else:
    	if (str[i] == '+'):
    	    si = 1
    	    i += 1
    while i < len(str):
        # if not in switcher:
        if str[i] not in switcher:
            i += 1
            while i < len(str):
                if str[i] in switcher:
                    return 0
                i += 1
            break
        else:
            result = result * 10 + switcher[str[i]]
            i += 1
    result = result * si
    if result.bit_length() > 31:
        if si > 0:
            return 2147483648
        else:
            return -2147483648
    return result


print(myAtoi('x-18613xxx'))

