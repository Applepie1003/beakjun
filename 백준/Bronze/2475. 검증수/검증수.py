num = input().split()
result = 0
if len(num) <= 5:
    for i in range(0, len(num)):
        tmp = int(num[i])
        result += tmp * tmp

print(result % 10)