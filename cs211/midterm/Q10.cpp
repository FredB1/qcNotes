#include <iostream>
using std::cout;
using std::endl;
using std::string;
int main()
{
    const int numDistinctToys = 5;
    const int numKids = 25;
    string toys[numDistinctToys] = {"Truck", "Doll", "Robot", "Yo-Yo", "Kite"};
    for (int i = 0; i < numKids; i++)
    {
        cout<<"Kid #"<<i+1<<": "<<toys[i%numDistinctToys]<<"\n";
    }
    
    return 0;
}