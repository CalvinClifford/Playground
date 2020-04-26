#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b,c,d,count=0,sum=0;
  std::cin>>a;
  c=a;
  d=c;
  while(a>0)
  {
    b=a%10;
    a=a/10;
    count++;
  }
  while(c>0)
  {
    b=c%10;
    c=c/10;
	sum=sum+pow(b,count);
  }
  if(sum==d)
  {
    std::cout<<"Kindly proceed with encrypting";
  }
  else
  {
    std::cout<<"It is not an Armstrong number";
  }
}