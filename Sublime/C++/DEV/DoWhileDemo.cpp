#include<iostream>
#include<cmath>
using namespace std;
int main(){
    //��һ�ַ���
    // double e = 1.0,u = 1.0;
    // int n = 1;
    // while (u >= 1.0E-7){
    //     u = u / n;
    //     e = e + u;
    //     n = n + 1;
    // }
    // cout<<"e = "<<"(n = "<<n<<")"<<endl;
    //�ڶ��ַ���
    // double e = 1.0,u = 1.0;
    // int n = 1;
    // do
    // {
    //     u = u / n;
    //     e = e + u;
    //     n = n + 1;
    // } while (u>=1.0E-7);
    // cout<<"e = "<<"(n = "<<n<<")"<<endl;
    //�ڶ�������
    double x,n;
    while (1)
    {
        cin>>x>>n;
        if(x==0&&n==0)
        {cout<<"Program terminationed"<<endl;   break;}
            
        else
            if((x<0&&n<=0)||(x<0&&1/n!=int(1/n)))
            {cout<<"error reinput"<<endl;     continue;}
                
    cout<<x<<"\t"<<n<<"th root"<<pow(x,1.0 / n)<<endl;}
    
    
    return 0;}

