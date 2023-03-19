#include <iostream>
using std::cout;
using std::endl;
void printOneToNum(const int num);
int main()
{
    printOneToNum(50000);
    return 0;
}
void printOneToNum(const int num)
{
    if (num == 0)
        return;
    printOneToNum(num - 1);
    cout << num<<" ";
    return;
}