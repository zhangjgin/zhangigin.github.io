#include<iostream>
#include<cmath>
using namespace std;
int main(){
    double a,b,c;
    double delta;
    double x,x1,x2;
    cout<<"������һԪ���η��̵�����ϵ��a,b,c��";
    cin>>a>>b>>c;
    if (a==0)
    {
        if (b==0)
        {
            cout<<"�����ϵ�������ɷ���"<<endl;

        }
        else
        {
            x=-c/b;
            cout<<"ʵ��ΪһԪһ�η��̣���Ϊ"<<x<<endl;
        }


    }
    else
    {
        delta=b*b-4.0*a*c;
        if (delta>=0)
        {
            delta = sqrt(delta);
            x1=(-b+delta)/2.0/a;
            x2=(-b+delta)/2.0/a;
            cout<<"������ʵ���������ǣ�"<<endl;
            cout<<"x1="<<x1<<",x2="<<x2<<endl;

        }
        else
        {
            delta=sqrt(delta);
            x1=-b/2.0/a;
            x2=delta/2.0/a;
            cout<<"����ʽ�и����������ǣ�"<<endl;
            cout<<"x1="<<x1<<"+j"<<x2<<",x2="<<x1<<"-j"<<x2<<endl;
        }


    }
    return 0;


}