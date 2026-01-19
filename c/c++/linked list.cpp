#include <iostream>
using namespace std;

// Struktur node
struct Node {
    int data;
    Node *next;
};

// Pointer head (awal linked list)
Node *head = NULL;

// ====== INSERT DATA DARI DEPAN ======
void insertFront(int value) {
    Node *newNode = new Node;
    newNode->data = value;
    newNode->next = head;
    head = newNode;

    cout << ">> Insert " << value << " dari depan" << endl;
}

// ====== DELETE DATA DARI DEPAN ======
void deleteFront() {
    if (head == NULL) {
        cout << ">> Linked List kosong, tidak bisa delete!" << endl;
        return;
    }

    cout << ">> Hapus data: " << head->data << endl;
    head = head->next;
}

// ====== TAMPILKAN SEMUA DATA ======
void display() {
    if (head == NULL) {
        cout << ">> Linked List kosong!" << endl;
        return;
    }

    cout << "Isi Linked List: [ ";
    Node *current = head;
    while (current != NULL) {
        cout << current->data << " ";
        current = current->next;
    }
    cout << "]" << endl;
}

// ====== MAIN PROGRAM (LATIHAN) ======
int main() {
    cout << "=== Latihan Program Linked List ===" << endl << endl;

    display();          // Tampilkan list awal

    insertFront(10);    // Tambah data
    display();

    insertFront(20);
    display();

    insertFront(30);
    display();

    deleteFront();      // Hapus data
    display();

    deleteFront();
    display();

    deleteFront();
    display();

    return 0;
}
