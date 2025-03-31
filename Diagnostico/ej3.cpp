#include <bits/stdc++.h>
using namespace std;
int main(){
   int n;
   vector<int> arr;
   for (int i = 0; i < 9; i++){
       cout << "Ingrese un numero" << endl;
       cin >> n;
       arr.push_back(n);
   }
   sort(arr.begin(), arr.end());
   for (int i = 0; i < arr.size(); i++){
       cout << arr[i] << " ";
   }
   cout << endl;
   return 0;
}