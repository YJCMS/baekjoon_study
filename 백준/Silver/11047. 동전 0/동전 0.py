import sys

n, k = map(int, sys.stdin.readline().split())
coin = list(int(sys.stdin.readline()) for _ in range(n))
maxCoinIndex = 0
count = 0

for i in range(n):
    if coin[maxCoinIndex] <= k :
        maxCoinIndex = i
    
while k != 0:
    count += k//coin[maxCoinIndex]
    k = k % coin[maxCoinIndex]
    maxCoinIndex -= 1
    
print(count)