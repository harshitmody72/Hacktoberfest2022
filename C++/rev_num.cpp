#include<iostream>
#include<math.h>
using namespace std;


int main()
{
    uint32_t n=1,rev=0;
        for(int i=31; i>=0; i--)
        {
            uint32_t y= (1<<i);
            if(n&y)
            {
                rev=((rev)|(2147483648>>i));
            }
        }
    cout<<rev;

return 0;
}
