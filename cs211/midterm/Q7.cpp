#include <iostream>
using std::cout;
using std::endl;
int log(const int base, const int num);
int main()
{
    cout<<log(4, 64);
    return 0;
}
int log(const int base, const int num)
{
    if (num == 1)
        return 0;
    return log(base,num/base)+1;
}