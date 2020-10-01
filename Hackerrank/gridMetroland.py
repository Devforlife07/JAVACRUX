n, m, k = map(int, input().split())
data = {}
railwayPoints = 0
ans = n*m
for _ in range(k):
    r, c1, c2 = map(int, input().split())
    if r in data:
        data[r].append((c1, c2))
    else:
        data[r] = [(c1, c2)]
for t in data:
    temp = data[t]
    temp.sort()
    begin = temp[0][0]
    end = temp[0][1]
    points = 0
    for i in range(1, len(temp)):
        if temp[i][0] > end:
            points += end-begin+1
            begin = temp[i][0]
            end = temp[i][1]
        else:
            end = max(end, temp[i][1])
    points += end-begin+1
    railwayPoints += points
print(ans-railwayPoints)
