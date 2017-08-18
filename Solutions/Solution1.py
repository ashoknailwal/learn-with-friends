#!/bin/python3

import sys
from math import gcd

def gcdArray(a):
    gcdVal = a[0]
    for i in range(1,len(a)):
        gcdVal = gcd(gcdVal, a[i])
    return gcdVal

def lcm(a,b):
    return (a*b)//gcd(a,b)

def lcmArray(a):
    lcmVal = a[0]
    for i in range(1,len(a)):
        lcmVal = lcm(lcmVal, a[i])
    return lcmVal

def getTotalX(a, b):
    count = 0
    i = lcmVal = lcmArray(a)
    gcdVal = gcdArray(b)     
    while i<=gcdVal:
        if gcdVal%i == 0:
            count = count+1
        i = i+lcmVal
    return count
    

if __name__ == "__main__":
    n, m = input().strip().split(' ')
    n, m = [int(n), int(m)]
    a = list(map(int, input().strip().split(' ')))
    b = list(map(int, input().strip().split(' ')))
    total = getTotalX(a, b)
    print(total)
