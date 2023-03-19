#include <iostream>
using std::cout;
using std::endl;
int pow(const int base, const int exp);
int main()
{
    cout << pow(4, 5);
    return 0;
}
int pow(const int base, const int exp)
{
    if (exp == 0)
        return 1;
    return pow(base, exp - 1) * base;
}