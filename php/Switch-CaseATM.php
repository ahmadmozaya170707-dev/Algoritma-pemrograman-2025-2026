<?php
function main() {
    $nama = readline("masukan nama : ");
    if ($nama != "moza") {
        echo "masukan lagi nama :" . PHP_EOL;
        return main(); // sama seperti return main() di C++
    }
    $nim = (int) readline("masukan NIM : ");
    $saldo = $nim;
    echo "saldo awal kamu : Rp$saldo\n";
    echo "masukan lagi nama : $nama\n";
    echo "saldo awal kamu : Rp$saldo\n";

    echo "\n=== MENU ATM ===\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    $pilih = readline("Pilih menu (1-5): ");

    $menu = readline("pilih menu: ");

    switch ($menu) {
        case 1:
            echo "Saldo kamu : Rp$saldo\n";
            break;

        case 2:
            echo "tarik tunai (untuk sekarang tidak bisa)\n";
            break;

        case 3:
            echo "setor tunai (untuk sekarang tidak bisa)\n";
            break;

        case 4:
            echo "transfer (untuk sekarang tidak bisa)\n";
            break;

        case 5:
            echo "keluar\n";
            break;

        default:
            echo "tidak ada\n";
            break;
    }

    return 0;
}

main();
