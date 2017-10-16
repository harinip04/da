#include<iostream>
using namespace std;
//to find gn no. is +ve or -ve or zero
int main()
{
  int a;
  cin>>a;
  if(a==0)
    cout<<"zero";
  else
    (a<0)?cout<<"negative":cout<<"positive";
}
