#include<iostream>
using namespace std;
int main(){
	double a,b,c,max;
	cin>>a>>b>>c;
//��һ�ַ����� 
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
//�ڶ��ַ�����
//	max=a;
//	if(!(a>b&&a>c)){
//		if(b>c){
//			max=b;
//		}else{
//			max=c;
//		}
//	}
//�����ַ�����
	max=a;
	if(max<b)
		max=b;
	if(max<c)
		max=c;
	cout<<max;
	return 0;
}
