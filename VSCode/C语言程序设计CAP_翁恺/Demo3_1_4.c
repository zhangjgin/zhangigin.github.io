#include<stdio.h>
int main()
{
    // int price = 0;
    // int bill = 0;
    // printf("请输入金额：");
    // scanf("%d",&price);
    // printf("请输入票面：");
    // scanf("%d",&bill);
    // if( bill >= price){
    //      printf("应该找您：%d\n",bill-price);
    // }else
    // {
    // printf("您的钱不够\n");
        
    // }
    //比较两个数的大小
    //方案一
    // int a,b;
    // printf("请输入两个整数：");
    // scanf("%d %d",&a,&b);
    // int max = 0;
    // if (a > b)
    // {
    //     max = a;
    // }
    // if (b > a)
    // {
    //     max = b;
    // }
    
    


    //方案二
    //     int a,b;
    // printf("请输入两个整数：");
    // scanf("%d %d",&a,&b);
    // int max = b;
    // if (a > b)
    // {
    //     max = a;
    // }
   
    
    

    //方案三
        int a,b;
    printf("请输入两个整数：");
    scanf("%d %d",&a,&b);
    int max = 0;
    if (a > b)
    {
        max = a;
    }else
    {
        max = b;
    }

    //方案四

    
   
    

    printf("大的那个是%d\n",max);
 return 0;
}
