#include <iostream> 
using std::cout;
using std::cin;
using std::endl;
#include <string>
int main(){
     int nextMultiple = 0;
int i = 0;
do{
nextMultiple+= 5;
cout << "Multiple #" <<nextMultiple /5<<": "<<nextMultiple<<endl;
}
while(nextMultiple<50);
return 0;
}