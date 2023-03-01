#include <iostream>
#include <cmath>
using namespace std;

bool ok(int q[], int c);
void print(int q[]);
int numSolutions = 0;

int main()
{
    int q[8] = {};
    int c = 0;
    while (c >= 0)
    {
        if (c == 7)
        {
            print(q);
            --c;
        }
        else
            q[++c] = -1;
        while (c >= 0)
        {
            ++q[c];
            if (q[c] == 8)
                --c;
            else if (ok(q, c))
                break;
        }
    }
    return 0;
}
bool ok(int q[], int c)
{
    for (int i = 0; i < c; ++i)
        if (q[i] == q[c] || abs(q[i] - q[c]) == c - i)
            return false;
    return true;
}

void print(int q[])
{
    cout << "Solution #" << ++numSolutions << ": ";
    for (int i = 0; i < 8; i++)
        cout << q[i];
    cout << "\n";
}