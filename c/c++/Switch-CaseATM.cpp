#include <iostream>
using namespace std;

 int main(){
    char nama[70];
    bool ismoza = true;

    cout<<"masukan nama : ";
    cin>>nama;

    if (string(nama) !="moza")
    {
        ismoza = false;
        cout<<"masukan lagi nama :"<<endl;
        return main();
    }
    
    int nim;
    cout<<"masukan NIM";
    cin>>nim;

    int saldo = nim;
    cout<<"saldo awal kamu : Rp"<<saldo;

    cout<<"masukan lagi nama :"<<nama<<endl;
    cout<<"saldo awal kamu : Rp"<<saldo<<endl;

    int pilih;
     cout<< "\n=== MENU ATM ==="<< endl;
    cout<< "1. Cek Saldo"<< endl;
    cout<< "2. Tarik Tunai" << endl;
    cout<< "3. Setor Tunai" << endl;
    cout<< "4. Transfer" << endl;
    cout<< "5. Keluar" << endl;
    cout<< "Pilih menu (1-5): ";
    cin>> pilih;

    int menu;
    cout<<"pilih menu";
    cin>>menu;
    switch (menu)
    {
    case 1: cout << "Saldo kamu : Rp" << saldo << endl; break;
    case 2: cout << "tarik tunai (untuk sekarang tidak bisa)"<< endl; break;
    case 3: cout << "setor tunai (untuk sekarang tidak bisa)"<< endl; break;
    case 4: cout << "transfer (untuk sekarang tidak bisa)"<< endl; break;
    case 5: cout << "keluar"<< endl; break;
    
    default: cout<<"tidak ada"<<endl;break;
    }
    return 0;
}