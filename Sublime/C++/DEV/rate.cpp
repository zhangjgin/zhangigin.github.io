#include<iostream>
#include<cmath>
using namespace std;
int main(){
	double money,years,deposit,rate;
	cout<<"���������"; 
	cin>>money;
	cout<<"��������Ҫ���뼸�꣺";
	cin>>years;
	cout<<"�����������ʣ�";
	cin>>rate;
	while(money>0){
		deposit=money*pow((1+rate),years);
		cout<<deposit<<endl;
		cout<<"���������"; 
		cin>>money;
		cout<<"��������Ҫ���뼸�꣺";
		cin>>years;
		cout<<"�����������ʣ�";
		cin>>rate;		
	}
	return 0;
	
}
