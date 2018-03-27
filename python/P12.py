def inToRoman(num):
    
    def cal(n, P1, P2, i):
        if n == 0:
            return ''
        if n == 1:
            return P1[i]
        if n == 2:
            return P1[i]+P1[i]
        if n == 3:
            return P1[i]+P1[i]+P1[i]
        if n == 4:
            return P1[i]+P2[i]
        if n == 5:
            return P2[i]
        if n == 6:
            return P2[i]+P1[i]
        if n == 7:
            return P2[i]+P1[i]+P1[i]
        if n == 8:
            return P2[i]+P1[i]+P1[i]+P1[i]
        if n == 9:
            return P1[i]+P1[i+1]

        return ''

    a = list()
    while num > 0:
        a.append(num % 10)
        num = int(num / 10)
    I = 'IXCM'
    V = 'VLD '
    result = ''
    for i in range(len(a)):
        result = cal(a[i],I,V,i) + result


    return result

c = inToRoman(3999)
print(c)