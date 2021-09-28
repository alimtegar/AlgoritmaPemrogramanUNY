persenTunjangan = 0.2
persenPajak = 0.15

print('Masukkan nama karyawan: ', end='')
namaKaryawan = input()

print('Masukkan gaji pokok: ', end='')
gajiPokok = int(input())

tunjangan = int(persenTunjangan * float(gajiPokok))
pajak = int(persenPajak * float(gajiPokok + tunjangan))
gajiBersih = gajiPokok + tunjangan - pajak

print()
print('Gaji bersih karyawan "' + namaKaryawan + '": ' + str(gajiBersih))