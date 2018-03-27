class Solution(object):
    def nextClosestTime(self, time):
        """
        :type time: str
        :rtype: str
        """
        ch = list()
        for i in range(len(time)):
            if time[i] != ':':
                ch.append(int(time[i]))
        
        t_value = (ch[0]*10 + ch[1]) * 60 + (ch[2]*10 + ch[3])
        print(t_value)
        ch = list(set(ch))
        mins = 2*24*60

        def search(i,b,mins,target):
            print(i,b,mins,target)
            if i == 4:
                time_now = (b[0]*10 + b[1]) * 60 + (b[2]*10 + b[3])
                if (b[0]*10 + b[1]) < 24 and (b[2]*10 + b[3]) < 60 and (time_now - t_value) != 0:
                    print(time_now - t_value)
                    if time_now - t_value < 0:
                        ttt = time_now + 24*60 - t_value
                    else:
                        ttt = time_now - t_value
                    if ttt < mins:
                        mins = ttt
                        temp_target = ''
                        for ele in b:
                            temp_target = temp_target + str(ele)
                        target = temp_target[0:2] + ':' + temp_target[2:4]
                return target, mins
            else:
                for j in range(len(ch)):
                    new_b = b.copy()
                    new_b.append(ch[j])
                    target, mins = search(i+1,new_b,mins,target)
                return target, mins

        answer,_ = search(0,[],mins,'-1')
        if answer == '-1':
            answer = time
        return answer

si = Solution()
print(si.nextClosestTime('11:11'))


                 




