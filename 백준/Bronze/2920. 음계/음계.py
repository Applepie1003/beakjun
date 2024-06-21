scale = input().split()

# ascending 검증
num = 1
ascending_sum = 0

for a in scale:
    if int(a) == num:
        ascending_sum += 1
    else:
        break
    num += 1

if ascending_sum == 8:
    print('ascending')
    exit(0)

# descending 검증
descending_sum = 0
num = 8

for a in scale:
    if int(a) == num:
        descending_sum += 1
    else:
        break
    num -= 1

if descending_sum == 8:
    print('descending')
else:
    print('mixed')