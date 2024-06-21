a = int(input())
b = int(input())
c = int(input())

result = []
tmp = 0
sum = list(str(a * b * c))

for i in range(0, 10):
    tmp = 0
    for j in range(0, len(sum)):
        if sum[j] == str(i):
            tmp += 1
    result.append(tmp)

for i in result:
    print(i)