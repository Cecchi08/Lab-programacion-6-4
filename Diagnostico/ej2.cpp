#include <bits/stdc++.h>
using namespace std;
int main(){
   int n1, n2, n3, mayor, mitad, menor;
   cout << "Ingrese tres numeros" << endl;
   cin >> n1 >> n2 >> n3;
   mayor = max(max(n1, n2), n3);
   menor = min(min(n1, n2), n3);
   if (n1 != mayor && n1 != menor){
        cout << mayor << " " << n1 << " " << menor << endl;
   } else if (n2 != mayor && n2 != menor){
       cout << mayor << " " << n2 << " " << menor << endl;
   } else {
          cout << mayor << " " << n3 << " " << menor << endl;
   }
    return 0;
}