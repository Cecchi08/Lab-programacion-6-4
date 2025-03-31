#include <iostream>
using namespace std;

bool esPrimo(int num) {
    if (num < 2) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return false;
    }
    return true;
}

int main() {
    int n;
    cout << "Ingrese un número entero positivo: ";
    cin >> n;

    if (n <= 0) {
        cout << "El número debe ser positivo." << endl;
        return 1;
    }

    cout << "Números primos menores que " << n << ": ";
    for (int i = 2; i < n; i++) {
        if (esPrimo(i)) {
            cout << i << " ";
        }
    }
    cout << endl;
    return 0;
}