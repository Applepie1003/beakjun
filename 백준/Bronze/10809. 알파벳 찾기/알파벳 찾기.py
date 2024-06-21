s = list(input())
check = 0

for i in range(97, 123):
    for j in range(0, len(s)):
        if s[j] == chr(i):
            check = 1
            print(j)
            break
    if check == 0:
        print(-1)
    check = 0
