#include<iostream>
int main(){
  int n,fcount=0,mcount=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
	std::cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      fcount++;
    }
    if(a[i]%2!=0)
    {
      mcount++;
    }
  }
       std::cout<<mcount<<"\n";
  	   std::cout<<fcount;
         
  return 0;
}