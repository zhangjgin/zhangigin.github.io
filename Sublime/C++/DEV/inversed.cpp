#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n,m;
	char a,b,c,d,e;
	cout<<"Please input a five-digit number ";
	cin>>n;
	a=n%10;
	n=n/10;
	b=n%10;
	n=n/10;
	c=n%10;
	n=n/10;
	d=n%10;
	n=n/10;
	e=n%10;
	m=(((a*10+b)*10+c)*10+d)*10+e;
	cout<<"The inversed number is "<<m<<endl;
	return 0;
}
