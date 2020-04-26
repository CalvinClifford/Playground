#include<iostream>
using namespace std;
int main()
{
  int P,R,N;
  float interest,total,discount,settlement;
  std::cin>>P>>N>>R;
  interest=(P*N*R)/100;
  total=interest+P;
  discount=interest*2/100;
  settlement=total-discount;
  std::cout<<interest;
  std::cout<<"\n"<<total;
  std::cout<<"\n"<<discount;
  std::cout<<"\n"<<settlement;
}