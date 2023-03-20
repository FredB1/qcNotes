#include <iostream>
using std::cin;
using std::cout;
using std::endl;
void printAlphabet(const bool asUppercase);
int main(const int argc, const char *argv[])
{
    if (argc == 2)
    {
        const bool asUppercase = (bool)std::stoi(std::string(argv[1]));
        printAlphabet(asUppercase);
    }
    else
    {
        std::cout << "[ERROR]: Re-run the program with 0 or 1 as a cmd-line arg\n";
    }
}
void printAlphabet(const bool asUppercase)
{
    int start = 65;
    if (asUppercase != 0) start = start + 32;
    for (int i = 0; i < 26; i++)
    {
        cout << char(start + i);
    }
}