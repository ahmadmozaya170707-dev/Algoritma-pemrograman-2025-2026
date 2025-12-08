#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    string nim;
    cout << "Masukkan NIM: ";
    cin >> nim;

    // ubah string menjadi array digit
    vector<int> digit;
    for (int i = 0; i < nim.length(); i++) {
        digit.push_back(nim[i] - '0');
    }

    // Total
    int total = 0;
    for (int d : digit) {
        total += d;
    }

    // Maksimum
    int maks = digit[0];
    for (int d : digit) {
        if (d > maks) {
            maks = d;
        }
    }

    // Minimum
    int minin = digit[0];
    for (int d : digit) {
        if (d < minin) {
            minin = d;
        }
    }

    // Rata-rata
    float rata = (float) total / digit.size();

    // Reverse array
    vector<int> rev;
    for (int i = digit.size() - 1; i >= 0; i--) {
        rev.push_back(digit[i]);
    }

    // Output
    cout << "Digit : ";
    for (int d : digit) {
        cout << d << " ";
    }
    cout << endl;

    cout << "Total = " << total << endl;
    cout << "Maksimum = " << maks << endl;
    cout << "Minimum = " << minin << endl;
    cout << "Rata-rata = " << rata << endl;

    cout << "Reverse array: ";
    for (int d : rev) {
        cout << d << " ";
    }
    cout << endl;

    return 0;
}
