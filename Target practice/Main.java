#include<iostream>
using namespace std;
int main()
{
  int n,a,sum=0,b;
  std::cin>>n;
  while(sum<n)
  {
    std::cin>>a;
    sum=sum+a;
    b++;
  }
  std::cout<<"The number of turns is "<<b;
  
}
