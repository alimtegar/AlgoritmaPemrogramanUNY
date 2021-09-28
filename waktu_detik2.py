class Jam:
  def __init__(self, hh, mm, ss):
      self.hh = hh
      self.mm = mm
      self.ss = ss

print('Masukkan jam: ', end='')
hh = int(input())

print('Masukkan menit: ', end='')
mm = int(input())

print('Masukkan detik: ', end='')
ss = int(input())

j = Jam(hh, mm, ss)
totalDetik = (j.hh * 3600) + (j.mm * 60) + j.ss

print()
print('Total detik: ' + str(totalDetik))