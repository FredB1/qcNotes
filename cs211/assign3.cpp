#include <iostream>
using std::cout;
using std::cin;
using std::endl;
using std::string;

int main (){
    string string1 = "";
    string teams= "";
    int teamSize, members = 0;
cout<<"Please input a string of uppercase characters."<<endl;
//cin>> string1;
string1 = "ZZAZAA";
for( int i = 0; i<= string1.length()-1;i++){
    if(teams.find(string1[i])==-1){
        teams+= string1[i];
        }
        //cout<<(string1[i])<<endl; 
    }
teamSize = teams.size();
int a1[] = {};
members = string1.length()/teamSize;
cout<< "There are "<< teamSize<< " teams."<<endl;
cout<< "Each team has "<< members<< " runners."<<endl;
a1[0]+=1;
cout<< "Team   Score"<<a1[0]<<endl;


return 0;
}