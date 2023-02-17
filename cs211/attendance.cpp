#include <iostream>
using std::cout;
using std::endl;

int main()
{
    char firstName[] = {'F', 'r', 'e', 'd'};
    cout << "I am a CSCI 211 student. My first name is ";
    int numLetters = sizeof(firstName);
    for (int i = 0; i < numLetters; i++)
    {
        cout << firstName[i];
    }
    cout << "." << endl;
    return 0;
}