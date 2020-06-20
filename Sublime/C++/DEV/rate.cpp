#include<iostream>
#include<cmath>
using namespace std;
int main(){
	double money,years,deposit,rate;
	cout<<"请您输入金额："; 
	cin>>money;
	cout<<"请问您想要存入几年：";
	cin>>years;
	cout<<"请您设置利率：";
	cin>>rate;
	while(money>0){
		deposit=money*pow((1+rate),years);
		cout<<deposit<<endl;
		cout<<"请您输入金额："; 
		cin>>money;
		cout<<"请问您想要存入几年：";
		cin>>years;
		cout<<"请您设置利率：";
		cin>>rate;		
	}
	return 0;
	
}
