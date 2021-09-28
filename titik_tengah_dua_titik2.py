class Titik:
  def __init__(self, x, y):
      self.x = x
      self.y = y
      
print('Masukkan x untuk P1: ', end='')
p1X = int(input())

print('Masukkan y untuk P1: ', end='')
p1Y = int(input())

print('Masukkan x untuk P2: ', end='')
p2X = int(input())

print('Masukkan y untuk P2: ', end='')
p2Y = int(input())

p1 = Titik(p1X, p1Y)
p2 = Titik(p2X, p2Y)
p3 = Titik((p1.x + p2.x) // 2, (p1.y + p2.y) // 2)

print()
print('P3: (' + str(p3.x) + ', ' + str(p3.y) + ')')