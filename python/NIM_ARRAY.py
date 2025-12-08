nim = input("Masukkan NIM: ")

# ubah string menjadi array digit
digit = [int(c) for c in nim]

# Total
total = 0
for d in digit:
    total += d

# Maksimum
maks = digit[0]
for d in digit:
    if d > maks:
        maks = d

# Minimum
minin = digit[0]
for d in digit:
    if d < minin:
        minin = d

# Rata-rata
rata = total / len(digit)

# Reverse array
rev = []
for i in range(len(digit)-1, -1, -1):
    rev.append(digit[i])

print("Digit :", digit)
print("Total =", total)
print("Maksimum =", maks)
print("Minimum =", minin)
print("Rata-rata =", rata)
print("Reverse array:", rev)
