#include <iostream>
using std::cin;
using std::cout;
using std::endl;
using std::string;

int main()
{
    string it = "*";
    const int maxStars = 6;
    const int numRepeats = 4;
    for (int i = 0; i < numRepeats; i++)
    {
        string print = "";
        for (int j = 0; j < maxStars; j++)
        {
            print += it;
        cout << print << endl;

        }
    }
    return 0;
}