print('Masukkan nama: ', end='')
nama = input()

print('Masukkan nilai penjualan: ', end='')
nilaiPenjualan = int(input())

komisi = int(0.05 * float(nilaiPenjualan))

print()
print('Komisi salesman "' + nama + '": ' + str(komisi))