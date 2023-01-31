#include <iostream>
using namespace std;
int main()
{
    int win[6] = {0, 0, 0, 0, 0, 0};
    for (int i0 = 0; i0 <= 9; i0++)
    {
        for (int i1 = 0; i1 <= 9; i1++)
        {
            for (int i2 = 0; i2 <= 9; i2++)
            {
                for (int i3 = 0; i3 <= 9; i3++)
                {
                    for (int i4 = 0; i4 <= 9; i4++)
                    {
                        for (int i5 = 0; i5 <= 9; i5++)
                        {
                            cout<<i0<<i1<<i2<<i3<<i4<<i5<<endl;
                        }
                    }
                }
            }
        }
    }
    return 0;
}