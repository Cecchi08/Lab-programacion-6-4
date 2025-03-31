#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    float prom = 0;
    vector<int> arr;
    cout << " Ingrese un numero" << endl;
    cin >> n;
    while (n >= 0) {
        arr.push_back(n);
        cout << " Ingrese un numero" << endl;  
        cin >> n;
    }
    sort(arr.begin(), arr.end());
    cout << "El menor es:" << arr[0] << endl;
    cout << "El mayor es: " << arr[arr.size() - 1] << endl;
    for (int i = 0; i < arr.size(); i++){
        prom += arr[i];
    }
    prom /= arr.size();
    cout << "El promedio es: " << prom << endl;
    return 0;
}