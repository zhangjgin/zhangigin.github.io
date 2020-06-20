#include<iostream>
using namespace std;
int main(){
//	int sum=0,i,n;
//	cin>>n;
//	for(i=1;i<=n;i++){
//		sum=sum+i;
//	}
//	cout<<sum;
//¼ÆËã¾Å¾Å³Ë·¨±í 
	int i,j;
	for(i=1;i<=9;i++){
		for(j=1;j<=i;j++){
			cout<<j<<"*"<<i<<"="<<j*i<<"\t";
			
		}
		cout<<endl;
	}
	return 0;
}
