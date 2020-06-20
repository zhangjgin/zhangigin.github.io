#include<iostream>
using namespace std;
int main(){
	int y;
	bool f;
	cin>>y;
	f = (y%4 == 0 && y%100 != 0) || (y%400 == 0);
	cout<<f;
	return 0; 



}
