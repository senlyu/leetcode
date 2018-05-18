def isMatch(s, p):
    plen = len(p)
    slen = len(s)
    dp = [[True] * (plen+1) for _ in range(slen+1)]
    for i in range(1, slen+1):
        dp[i][0] = False
    for j in range(1, plen+1):
        dp[0][j] = (dp[0][j-2]) and (p[j-1] == '*')
    for i in range(1,slen+1):
        for j in range(1, plen+1):
            if (p[j-1] == '*') :
                dp[i][j] = ((dp[i][j-2]) or (dp[i][j-1]) or (dp[i-1][j]) and ((s[i-1] == p[j-2]) or (p[j-2] == '.')))
            else:
                dp[i][j] = ((dp[i-1][j-1]) and ((s[i-1] == p[j-1]) or (p[j-1] == '.')))
    #for i in range(slen+1):
    #    for j in range(plen+1):
    #        print(dp[i][j],i,j)
    return dp[slen][plen]

if isMatch('abcd','d*'):
    print('T')
else:
    print('F')

