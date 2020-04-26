#include<iostream>
using namespace std; 
  
int fib(int a) 
{ 
    if (a <= 1) 
        return a; 
    return fib(a-1) + fib(a-2); 
} 
  
int main () 
{ 
    int n;
  	std::cin>>n;
  	int a=n-1;
    cout << fib(a); 
     
    return 0; 
} 
