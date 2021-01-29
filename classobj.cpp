#include<iostream>
#include<string.h>
using namespace std;

class myclass{
    public:
    int mynum;
    string mystring;
};
int main(){
    myclass myobj;
    myobj.mynum=25;
    myobj.mystring="RAGUL TECHNOLOGY";
    
    cout<<myobj.mynum<<"\n";
    cout<<myobj.mystring<<endl;
}
