#include<iostream>
#include<math.h>
using namespace std;


class dist
{
    int a,b,c,d;
public:
    void get()
{
    
    cin>>c>>d;
}
    void calc()

{    int k;
    int l;
    k=( pow(c-3,2)  +   pow(d-4,2)  );
    l=pow(k,0.5);   
    cout<<l;
}
};


int main()
{
   
    dist m;
    m.get();
    m.calc();

return 0;
}