#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  std::cout<<n<<"\n";
  int sum=0;
  while(n!=1)
  {
  if(n%2==0)
  {
    n=n/2;
    std::cout<<n<<"\n";
  }
  else
  {
    n=3*n+1;
    std::cout<<n<<"\n";
  }
    sum=sum+1;
  }
  std::cout<<sum;
}