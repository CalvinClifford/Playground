#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
	std::cin>>a[i];
  }
  int b;
  std::cin>>b;
  int count=0;
  for(int i=0;i<n;i++)
  {
	if(b==a[i])
    {
	  count++;
    }
    
  }
  if(count==1)
  {
	std::cout<<"She passed her exam";
  }
  else
  {
	std::cout<<"She failed";
  }
}