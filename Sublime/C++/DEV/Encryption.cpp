#include<iostream>
using namespace std;
int main(){
	char c;
	char ec;
	int k;
	cout<<"Please input a lower character and k"<<endl;
	cin>>c>>k;
	ec=((c-'a')+k)%26+'a';
	cout<<ec<<endl;
	return 0;
}
