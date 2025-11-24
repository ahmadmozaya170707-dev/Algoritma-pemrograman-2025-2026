nama = input("masukan nama barang: ")
harga = int(input("masukan harga barang :"))
jumlah =int(input("masuka jumlah beli :"))

total = harga*jumlah

if total >56500:
    diskon = total * 0,
else:
    diskon = 0

total_bayar=total - diskon

print("\n====== STRUK PEMBELIAN =====")
print(f"nama barang : {nama}")
print(f"harga satuan : {harga}")
print(f"jumlah beli : {jumlah}")
print(f"total harga : {total}")
print(f"diskon : {diskon}")
print(f"total bayar : {total_bayar}")
print("==============================")
