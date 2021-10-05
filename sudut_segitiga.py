print('Sisi a: ', end='')
a = int(print())

print('Sisi b: ', end='')
b = int(print())

print('Sisi c: ', end='')
c = int(print())

print()
if (c * c > a * a + b * b):
    print('Segitiga lancip')
elif (c * c < a * a + b * b):
    print('Segitiga tumpul')
elif (c * c == a * a + b * b):
    print('Segitiga siku-siku')
else:
    print('Segitiga tidak diketahui')
