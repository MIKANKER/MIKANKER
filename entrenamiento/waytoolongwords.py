n = int(input())


for i in range(0, n):
    words = str(input())
    long = len(words)

    if long > 10:
        print(words[0], end="")
        print(long-2, end="")
        print(words[long-1])

    else:
        print(words)
