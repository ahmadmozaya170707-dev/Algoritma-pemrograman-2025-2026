<?php
$nama = readline("masukan nama barang: ");
$harga = readline("masukan harga barang: ");
$jumlah = readline("masukan jumlah beli: ");

$total = $harga*$jumlah;

if ($total>56500)
    echo $diskon = $total*0,5;
else
    echo $diskon =0;

$total_bayar = $total-$diskon;

echo"\n====== STRUK PEMBELIAN =====\n";
echo"nama barang : {$nama}";
echo"harga satuan : {$harga}";
echo"jumlah beli : {$jumlah}";
echo"total harga : {$total}";
echo"diskon : ${diskon}";
echo"total bayar : {$total_bayar}";
echo"==============================";
?>