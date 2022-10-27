#include <iostream>
using namespace std;
 
void swap(int &x, int &y)
{
    if (y && x != y)
    {
        x = x * y;      // overflow can happen
        y = x / y;
        x = x / y;
    }
}
 
int main()
{
    int x = 3, y = 4;
    swap(x, y);
 
    cout << x << " " << y;
 
    return 0;
}
