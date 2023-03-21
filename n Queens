def issafe(arr,x,y,n): # defining a function to check the safe spot by taking in the arguments of array and variable 
    #n that is a input depicting the number of queens we want
    
    # x = ROWS
    # y = COLUMNS
    
    for row in range(x):
        if arr[row][y] ==1:  # the x will vary and check whether a  new queen is situated in the row through any
            #other queen
            
            # Checking column attack
            return False      # if no return false
    row = x
    col = y
    #Checking Diagonal Attack
    while row>=0 and col>=0:
        if arr[row][col]==1:#if row and column are same
            return False
        row-=1 # row gets decremented by -1 
    
        col-=1# column gets decremented by -1

    row = x
    col = y
    #Checking Anti Diagonal Attack
    while row>=0 and col<n:
        if arr[row][col]==1:
            return False
        row-=1
        col+=1

    return True

def nQueen(arr,x,n):
    if x>=n:
        return True

    for col in range(n):
        if issafe(arr,x,col,n):
            arr[x][col]=1
            if nQueen(arr,x+1,n):
                return True
            arr[x][col] = 0

    return False




def main():
    n = int(input("Enter number of Queens : "))
    arr = [[0]*n for i in range(n)]

    if nQueen(arr,0,n):
        for i in range(n):
            for j in range(n):
                print(arr[i][j],end=" ")
            print()

if __name__ == '__main__':
    main()
