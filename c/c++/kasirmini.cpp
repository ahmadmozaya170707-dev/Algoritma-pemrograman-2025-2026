#include <iostream>
using namespace std;

int main(){
    char nama[70];
    int harga , jumlah;

    cout<<"masukan nama barang: ";
    cin>>nama;
    cout<<"masukan harga barang: ";
    cin>>harga;
    cout<<"masukan jumlah beli: ";
    cin>>jumlah;

    int total=harga*jumlah;
    double diskon;

    if (total>56500){
        diskon = total*0,5;
    }else{
        diskon = 0;
    }

    int total_bayar=total-diskon;

    cout<<"====== STRUK PEMBELIAN ====="<< endl;
cout<<"nama barang : "<<nama <<endl;
cout<<"harga satuan : "<<harga <<endl;
cout<<"jumlah beli : "<<jumlah <<endl;
cout<<"total harga : "<<total <<endl;
cout<<"diskon : "<<diskon <<endl;
cout<<"total bayar : "<<total_bayar <<endl;
cout<<"==============================" <<endl;
return 0;

}
