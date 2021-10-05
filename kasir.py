print('Total belanja: ', end='')
totalSpending = int(input())


print()
if (totalSpending > 100000):
    print('Diskon: 5%')
    print('Total akhir belanja: ' + str(int(totalSpending * 0.95)))
else:
    print('Diskon: 0%')
    print('Total akhir belanja: ' + str(totalSpending))
