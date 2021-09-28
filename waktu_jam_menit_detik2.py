class Jam:
  def __init__(self, hh, mm, ss):
      self.hh = hh
      self.mm = mm
      self.ss = ss
      
def pad_zero(n):
  return '0' + str(n) if n < 10 else str(n)

print('Masukkan total detik: ', end='')
totalDetik = int(input())

j = Jam(totalDetik // 3600, (totalDetik % 3600) // 60, (totalDetik % 3600) % 60)

print()
print('Waktu: ' + pad_zero(j.hh) + ':' + pad_zero(j.mm) + ':' + pad_zero(j.ss))