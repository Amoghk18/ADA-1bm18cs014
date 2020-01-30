#include <algorithm> 
#include <iostream> 
using namespace std; 
int main() 
{ 

    int t,a[100],n,ele;
    cout<< "Enter the number of test case\n";
    cin>>t;
    for(int j=0;j<t;j++){
    cout<< "Enter the number of elements\n";
    cin>>n;
    cout<< "Enter the elements\n";
    for(int i=0;i<n;i++){
    	cin>> a[i];
    }
    cout<< "Enter the element you want to search for :";
    cin>>ele;
    if (binary_search(a, a + n, ele)) 
        cout << "\nElement found in the array\n"; 
    else
        cout << "\nElement not found in the array\n\n"; 
    }
    return 0; 
} 
