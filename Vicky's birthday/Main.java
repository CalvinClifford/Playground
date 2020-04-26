#include <bits/stdc++.h> 
using namespace std;  
  
bool checkYear(int year)  
{  
     
    if (year % 400 == 0)  
        return true;  
  
    
    else if (year % 100 == 0)  
        return false;  
  
     
    else if (year % 4 == 0)  
        return true;  
    return false;  
}  
  
// Driver code  
int main()  
{  
    int year;
  	std::cin>>year;
  
    checkYear(year) ? cout << "Vicky can celebrate his birthday.":  
                      cout << "Vicky can't celebrate.";  
    return 0;  
}  
  