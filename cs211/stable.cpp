#include <iostream>
using namespace std;
void print(int arr[]);
bool ok(int arr[], int c);

int main()
{
    int arr[3] = {};
    int c = 0;
    while (c >= 0)
    {
        if (c == 2)
        {
            print(arr);
            --c;
        }
        else
            arr[++c] = -1;
        while (c >= 0)
        {
            ++arr[c];
            if (arr[c] == 3)
                --c;
            else if (ok(arr, c))
                break;
        }
    }
    return 0;
}
bool ok(int arr[], int c)
{
    static int m[3][3] = {{0, 2, 1},
                          {0, 2, 1},
                          {1, 2, 0}};
    static int w[3][3] = {{2, 1, 0},
                          {0, 1, 2},
                          {2, 0, 1}};
    for (int i = 0; i < c; ++i)
    {                                                                      
        if (arr[i] == arr[c]                                               
            || m[i][arr[c]] < m[i][arr[i]] && w[arr[c]][i] < w[arr[c]][c]  
            || m[c][arr[i]] < m[c][arr[c]] && w[arr[i]][c] < w[arr[i]][i]) 
            return false;                                                  
    }
    return true;
}

void print(int arr[])
{
    static int solution = 0;
    cout << "Solution #" << ++solution << ":\nMan\tWoman\n";
    for (int i = 0; i < 3; ++i)
        cout << i << "\t" << arr[i] << "\n";
    cout << "\n";
}
