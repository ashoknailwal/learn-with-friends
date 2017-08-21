#!/bin/python3

import string

a = list(map(int, input().split(' ')))

h = list(input().strip())
max = 0
for i in h:
    if (a[string.ascii_lowercase.index(i)]) > max:
        max = (a[string.ascii_lowercase.index(i)])
        pos = i

print(max*len(h))
