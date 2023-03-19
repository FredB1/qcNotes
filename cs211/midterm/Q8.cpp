#include <iostream>
using std::cout;
using std::endl;
int factorial(const int n);
int main()
{
    cout << factorial(5);
    return 0;
}
int factorial(const int n)
{
    if (n==1) return 1;
    return factorial(n-1) *n;
}