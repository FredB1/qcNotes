#include <iostream>
using std::cout;
using std::endl;
int fib(const int n);
int main()
{
    cout<<fib(18);
    return 0;
}
int fib(const int n){
    if (n==1)return 0;
    if (n==2)return 1;
return fib(n-1)+fib(n-2);
}