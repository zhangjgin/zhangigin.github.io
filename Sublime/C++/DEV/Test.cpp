#include<stdio.h>
int main(int argc, char const *argv[])
{
    int price = 0;
    int bill = 0;
    printf("�������");
    scanf("&d",&price);
    printf("������Ʊ�棺");
    scanf("%d",&bill);
    if( bill >= price){
         printf("Ӧ��������%d\n",bill-price);

    }
    return 0;
}

