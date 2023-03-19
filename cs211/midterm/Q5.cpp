#include <iostream>
using std::cout;
using std::endl;
using std::string;
void reverseInt(const int num);
int main()
{
    reverseInt(547537);
    return 0;
}
void reverseInt(const int num){
    if(num<1)return ;
    cout << (num%10);
    return reverseInt(num/10);
}