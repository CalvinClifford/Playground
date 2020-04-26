#include<iostream>
using namespace std;
int main()
{
  int c=0,inp;
  float m=0;
  while(c!=3)
  {
    cin>>inp;
    if(inp<0)
    {
      m-=1;
      break;
    }
    else if(inp%2==0)
    {
      m-=0.5;
    }
    else
    {
      m+=1;c+=1;
    }
  }
    cout<<m;
}
