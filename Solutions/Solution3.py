t = int(input())
for i in range(t):
    n, k = list(map(int, input().strip().split(' ')))
    a = list(map(int, input().strip().split(' ')))
    b = list(map(int, input().strip().split(' ')))
    maxVal = 0
    for i in range(n):
       if abs(b[i])>abs(b[maxVal]):
           maxVal = i
    if b[maxVal]<0:
        a[maxVal] = a[maxVal]-k
    else:
        a[maxVal] = a[maxVal]+k
    print(sum([i*j for i,j in zip(a,b)]))
            
