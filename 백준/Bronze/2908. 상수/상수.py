a, b = list(input().split())
a = list(a)
b = list(b)


def swap(num):
    tmp = num[0]
    num[0] = num[2]
    num[2] = tmp
    return num


a = swap(a)
a = int(''.join(a))

b = swap(b)
b = int(''.join(b))


if a > b:
    print(a)
else:
    print(b)
