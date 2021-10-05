print('Masukkan nilai: ', end='')
score = float(input())

print()
print('Hasil konversi: ', end='')
if (score >= 86 and score <= 100):
    print('A')
elif (score >= 81 and score <= 85):
    print('A-')
elif (score >= 76 and score <= 80):
    print('B+')
elif (score >= 71 and score <= 75):
    print('B')
elif (score >= 66 and score <= 70):
    print('B-')
elif (score >= 61 and score <= 65):
    print('C+')
elif (score >= 56 and score <= 60):
    print('C')
elif (score >= 41 and score <= 55):
    print('D')
else:
    print('E')