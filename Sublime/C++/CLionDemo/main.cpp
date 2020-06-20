#include<iostream>
#include<cmath>
using namespace std;
int main(){
    double a,b,c;
    double delta;
    double x,x1,x2;
    cout<<"请输入一元二次方程的三个系数a,b,c：";
    cin>>a>>b>>c;
    if (a==0)
    {
        if (b==0)
        {
            cout<<"输入的系数不构成方程"<<endl;

        }
        else
        {
            x=-c/b;
            cout<<"实际为一元一次方程，根为"<<x<<endl;
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
            cout<<"方程有实根，它们是："<<endl;
            cout<<"x1="<<x1<<",x2="<<x2<<endl;

        }
        else
        {
            delta=sqrt(delta);
            x1=-b/2.0/a;
            x2=delta/2.0/a;
            cout<<"方程式有复根，它们是："<<endl;
            cout<<"x1="<<x1<<"+j"<<x2<<",x2="<<x1<<"-j"<<x2<<endl;
        }


    }
    return 0;


}