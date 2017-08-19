#!/bin/python3

n = int(input().strip())
scores = [int(scores_temp) for scores_temp in input().strip().split(' ')]
m = int(input().strip())
alice = [int(alice_temp) for alice_temp in input().strip().split(' ')]
# your code goes here
for i in range(m):
    s = set(scores)
    s.add(alice[i])
    p = list(s)
    p.sort(reverse=True)
    print (p.index(alice[i]) + 1)
