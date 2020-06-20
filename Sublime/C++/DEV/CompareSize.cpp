#include<iostream>
using namespace std;
int main(){
	double a,b,c,max;
	cin>>a>>b>>c;
//第一种方法： 
//	if(a>b){
//		if(a>c){
//			max=a;
//		}else{
//			max=c;
//		}
//		
//	}else{
//		if(b>c){
//			max=b;
//		}else{
//			max=c;
//		}
//	}
//第二种方法：
//	max=a;
//	if(!(a>b&&a>c)){
//		if(b>c){
//			max=b;
//		}else{
//			max=c;
//		}
//	}
//第三种方法：
	max=a;
	if(max<b)
		max=b;
	if(max<c)
		max=c;
	cout<<max;
	return 0;
}
