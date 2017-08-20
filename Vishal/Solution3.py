t = int(input().strip())
for i in range(t):
    n, k = list(map(int, input().strip().split(' ')))
    a = list(map(int, input().strip().split(' ')))
    b = list(map(int, input().strip().split(' ')))
    p = 0
    for i in range(n):
        if a[i]*b[i] > p:
            p = a[i]*b[i]
            max_pos = i
            
    if a[max_pos] < 0:
        a[max_pos] = a[max_pos] - k
    else:
        a[max_pos] = a[max_pos] + k
    r = 0
    for i in range(n):
        r = r+a[i]*b[i]
    print(r)
