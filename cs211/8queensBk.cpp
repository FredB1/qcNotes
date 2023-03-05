#include <iostream>
#include <cmath>
using namespace std;

void print(int q[], int solution)
{
    cout << "Solution #" << solution << ":" << endl;
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (q[i] == j)
                cout << "1 ";
            else
                cout << "0 ";
        }
        cout << endl;
    }
}
bool ok(int q[], int c)
{
    for (int i = 0; i < c; i++)
    {
        if (q[c] == q[i] or (c - i == abs(q[c] - q[i])))
            return false;
    }
    return true;
}

int main()
{
    int q[8] = {0}, c = 0, solutions = 0;
    q[0] = 0;
    while (true)
    {
        c++;
        if (c == 8)
        {
            print(q, ++solutions);
            c--;
        }
        else
        {
            q[c] = -1;
        }

        while (true)
        {
            q[c]++;
            if (q[c] == 8)
            {
                c--;
                if (c == -1)
                {
                    return 0;
                }
            }
            else if (ok(q, c))
            {
                break;
            }
        }
    }
    return 0;
}
