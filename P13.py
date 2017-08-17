def romanToInt(s):
    mapper = {
      'M' : 1000,
      'D' : 500,
      'C' : 100,
      'L' : 50,
      'X' : 10,
      'V' : 5,
      'I' : 1,
    }
    i = 0
    t = 'M'
    result = 0
    while i < len(s):
        if mapper[s[i]] > mapper[t]:
            result = result + mapper[s[i]] - 2 * mapper[t]
        else:
            result = result + mapper[s[i]]
        t = s[i]
        i += 1
    return result

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

a = 123

print(a)

print(romanToInt(inToRoman(a)))
