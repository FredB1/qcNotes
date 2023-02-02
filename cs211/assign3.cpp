#include <iostream>
using std::cin;
using std::cout;
using std::endl;
using std::string;

int main()
{
    string string1 = "";
    string teams = "";
    int teamSize, members = 0;
    cout << "Please input a string of uppercase characters." << endl;
    // cin>> string1;
    string1 = "ZZAZAA";
    for (int i = 0; i <= string1.length() - 1; i++)
    {
        if (teams.find(string1[i]) == -1)
        {
            teams += string1[i];
        }
    }
    teamSize = teams.size();
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

    cout << "Team   Score " << scr[1]<<endl;

    return 0;
}