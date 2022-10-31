#include<iostream>
using namespace std;

int main()
{
    int a=5;

    for(int i=31; i>=0; i--)
    {

        int y=(1<<i);

        if(a&y)
        {
            cout<<1;
        }

        else
        {
            cout<<0;
        }

    }
return 0;
}
