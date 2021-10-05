print('Masukkan karakter digit: ', end='')

charDigitIn = input()
charDigit = int(charDigitIn)

if (charDigitIn.isdigit() and charDigit >= 0 and charDigit <= 9):
    print()
    print('Hasil konversi: ' + str(charDigit))
else:
    print()
    print('Hasil konversi: -1')