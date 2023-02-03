#include <iostream>
using std::cin;
using std::cout;
using std::endl;
using std::exit;
using std::string;

string getInput();
int getTeams(string s1);
string teamNames(string s1);
int main()
{
    while (true)
    {
        string input = getInput();
        int max = getTeams(input);
        string members = teamNames(input);
        int scores[members.length()]={};
        for(int i =0; i<input.length();i++){
           scores[members.find(input[i])]+=i+1;
        }
        int min =100000;
        for(int i =0; i< members.length();i++){
            if(scores[i]<min){
                min =scores[i];
            }
        }
        cout<<"There are "<<members.length()<< " teams.\n";
        cout<<"Each team has "<<max<< " runners.\n";
        cout<<"Team  Score\n";
        for (int i = 0; i < members.length(); i++)
        {
           printf("%c     %.2f\n", members[i], ((float)scores[i]/ max));
        }
        int winner =0;
        for (int i = 0; i < members.length(); i++)
        {if(scores[i]==min)winner=i;
        }
        printf("The winning team is team %c with a score of %.2f.\n", members[winner], ((float)scores[winner]/ max));

    }
    return 0;
}
string getInput()
{
    string s1 = "";
    cout << "Please enter a string of uppercase characters indicating the outcome of a race." << endl;
    cin >> s1;
    if (s1 == "done")
        exit(0);

    return s1;
}
int getTeams(string s1)
{
    int memCount[26] = {};
    int max = 0;
    for (int i = 0; i < s1.length(); i++)
    {
        int pos = int(s1[i]) - 65;
        if (pos > 26)
            getInput();
        memCount[pos]++;
    }
    for (int i = 0; i < 26; i++)
    {

        if (memCount[i] > max)
            max = memCount[i];
    }
    if (s1.length() % max != 0)
    {
        cout << "There was an error in your input, please input an equal amount of team members.\n";
        getInput();
    }
    return max;
}
string teamNames(string s1)
{
     string temp = "";
    for (int i = 0; i < s1.length(); i++)
    {
        if (temp.empty() || s1[i] < temp[0]) temp = s1[i] + temp;
       else if(temp.find(s1[i])==-1)temp=temp + s1[i];
    }
    return temp;
}
