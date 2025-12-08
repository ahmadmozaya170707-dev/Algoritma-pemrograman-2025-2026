<?php
echo "Masukkan NIM: ";
$nim = trim(fgets(STDIN));

# ubah string menjadi array digit
$digit = [];
for ($i = 0; $i < strlen($nim); $i++) {
    $digit[] = (int)$nim[$i];
}

# Total
$total = 0;
foreach ($digit as $d) {
    $total += $d;
}

# Maksimum
$maks = $digit[0];
foreach ($digit as $d) {
    if ($d > $maks) {
        $maks = $d;
    }
}

# Minimum
$minin = $digit[0];
foreach ($digit as $d) {
    if ($d < $minin) {
        $minin = $d;
    }
}

# Rata-rata
$rata = $total / count($digit);

# Reverse array
$rev = [];
for ($i = count($digit) - 1; $i >= 0; $i--) {
    $rev[] = $digit[$i];
}

# Output
echo "Digit : ";
foreach ($digit as $d) {
    echo $d . " ";
}
echo PHP_EOL;

echo "Total = $total" . PHP_EOL;
echo "Maksimum = $maks" . PHP_EOL;
echo "Minimum = $minin" . PHP_EOL;
echo "Rata-rata = $rata" . PHP_EOL;

echo "Reverse array: ";
foreach ($rev as $d) {
    echo $d . " ";
}
echo PHP_EOL;
