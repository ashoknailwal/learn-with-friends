#!/bin/python3

def getTotalX(a, b):
    # Complete this function
    count = 0
    for i in range(max(a), min(b)+1):
        if max(a) > min(b):
            break
        elif all(i%x == 0 for x in a ) and all(y%i == 0 for y in b):
            count +=1
    return count

if __name__ == "__main__":
    n, m = input().strip().split(' ')
    n, m = [int(n), int(m)]
    a = list(map(int, input().strip().split(' ')))
    b = list(map(int, input().strip().split(' ')))
    total = getTotalX(a, b)
    print(total)
