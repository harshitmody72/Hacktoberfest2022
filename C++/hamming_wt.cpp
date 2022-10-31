#include<iostream>
using namespace std;

int main()
{
    int n=5,counter=0;

    for(int i=31; i>=0; i--)
    {

        int y=(1<<i);

        if(n&y)
        {
            cout<<1;
            //count number of one's
            counter++;
        }

        else
        {
            cout<<0;
        }

    }
cout<<counter<<endl;
return 0;
}
