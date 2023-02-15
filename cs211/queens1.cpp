#include <iostream>
using std::cout;

int main(){
    int b[8][8]={0}, numSolutions, row, col = 0;
    b[0][0]= 1;
    nc: col++;
        if(col==8) goto print;
        row = -1;
    nr: row++;
        if (row==8)goto backtrack;
        for (int i = 0; i < col; i++)
        {if (b[row][i]==1)goto nr;}
        for (int i = 1; (row-i)>=0 and (col-i)>=0; i++)
        {if (b[row-i][col-i]==1)goto nr;}
        for (int i = 1;(row+i)<8 and (col-i)>=0; i++)
        {if (b[row+i][col-i]==1)goto nr;}
        b[row][col]=1;
        goto nc;
    backtrack: 
        --col;
        if(col<0) return 0;
        row=0;
        while(b[row][col]!=1){
            row++;}
        b[row][col]=0;
        goto nr;        
    print: cout<<"Solution #" << ++numSolutions<<":\n";
        for (int i = 0; i <8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                cout<<b[i][j];
            }
            cout<<"\n";
            
        }
        
        goto backtrack;
    return 0;
}