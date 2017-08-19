#!/bin/python3

import sys


n = int(input().strip())
scores = [int(scores_temp) for scores_temp in input().strip().split(' ')]
m = int(input().strip())
alice = [int(alice_temp) for alice_temp in input().strip().split(' ')]
s = list(set(scores))
s.sort(reverse=True)
j = len(s)-1
for i in alice:
    while(j>=0 and s[j]<=i):
        j-=1
    print(j+2)
    
