#include <iostream>
#include <algorithm>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    string string1 = "";
    string teams = "";
    int teamSize, members = 0;
    while (true)    {
    cout << "Please input a string of uppercase characters." << endl;
    cin>> string1;
    if(string1=="done")break;
    for (int i = 0; i <= string1.length() - 1; i++)
    {
        if (teams.find(string1[i]) == -1)
        {
            teams += string1[i];
        }
    }
    teamSize = teams.size();
    sort(teams.begin(), teams.end());
    float scr[teamSize];
    for (int i = 0; i <= teamSize; i++){
        scr[i] = 0;
    }
    for (int i = 0; i <= string1.length() - 1; i++)
    {
      int tempTeam = teams.find(char (string1[i]));
      scr[tempTeam]+= i+1;
    }
    members = string1.length() / teamSize;
    for (int i = 0; i <= teamSize; i++){
        scr[i] /= float (members) ;
    }
    cout << "There are " << teamSize << " teams." << endl;
    cout << "Each team has " << members << " runners." << endl;

    cout<< "Team   Score "<<endl;
    for(int i =0; i< teams.length();i++){
        cout<<teams[i]<<"      ";
        cout<<fixed << setprecision(2) <<scr[i]<<endl;
    }
    int min1= scr[1];
    }
    

    return 0;
}