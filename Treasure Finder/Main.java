#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,l,m,n,i,gcd,min,hcf;
  std::cin>>a>>b>>c;
  
  if(a>b &&a>c)
  {
    l=a;
  }
  if(b>a && b>c)
  {
    l=b;
  }
  if(c>a && c>b)
  {
    l=c;
  }
  if(a<b &&a<c)
  {
    m=a;
  }
  if(b<a && b<c)
  {
    m=b;
  }
  if(c<a && c<b)
  {
    m=c;
  }
  if(a!=m && a!=l)
  {
    std::cout<<"The treasure is in box which has number "<<a;
  }
  if(b!=m && b!=l)
  {
    std::cout<<"The treasure is in box which has number "<<b;
  }
  if(c!=m && c!=l)
  {
    std::cout<<"The treasure is in box which has number "<<c;
  }

 	for( int i = min; i>0; i--)
	{
	  if(a%i == 0 && b%i == 0 && c%i == 0)
	{
      hcf = i;
      std::cout<<"\n"<<"The code to open the box is "<<hcf;
      break;
    }
   }
}