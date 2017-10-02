class Solution(object):
    def solveSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: void Do not return anything, modify board in-place instead.
        """
        from copy import deepcopy
        check = [[dict() for __ in range(9)] for _ in range(3)]
        for i in range(9):
            for j in range(9):
                ele = board[i][j]
                if ele != '.':
                    check[0][i][ele] = 1
                    check[1][j][ele] = 1
                    check[2][i//3+j//3*3][ele] = 1
        
        def step(i,j,check):
            if i == 9:
                return True, check
            if j == 9:
                return step(i+1,0,check)
            if board[i][j] != '.':
                return step(i,j+1,check)
            for k in range(1,10):
                if not(str(k) in check[0][i]) and not(str(k) in check[1][j]) and not(str(k) in check[2][i//3+j//3*3]):
                    board[i] = board[i][:j] + str(k) + board[i][j+1:]
                    check[0][i][str(k)] = 1
                    check[1][j][str(k)] = 1
                    check[2][i//3+j//3*3][str(k)] = 1
                    flag, check = step(i,j+1,check)
                    if flag:
                        return True, check
                    board[i] = board[i][:j] + '.' + board[i][j+1:]
                    del check[0][i][str(k)]
                    del check[1][j][str(k)]
                    del check[2][i//3+j//3*3][str(k)]
            return False, check
                    
        
        flag, check = step(0,0,check)
        print(board)
s = Solution()
s.solveSudoku(["..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."])