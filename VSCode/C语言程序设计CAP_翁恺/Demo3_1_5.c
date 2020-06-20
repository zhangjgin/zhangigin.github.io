#include <stdio.h>
int main(int argc, char const *argv[])
{
    //例1
    // const int PASS = 60;
    // int score;

    // printf("你输入的成绩：");
    // scanf("%d",&score);

    // printf("你输入的成绩是%d。\n",score);
    // if (score<PASS)
    // {
    //     printf("很遗憾，这个成绩没有及格");
    // }else
    // {
    //     printf("祝贺你，这个成绩及格了");
    // }
    // printf("再见\n");

    //例2
    const double RATE = 8.25;
    const int STANDARD = 40;
    double pay = 0.0;
    int hours;

    printf("请输入工作的小时数：");
    scanf("%d", &hours);
    printf("\n");
    if (hours > STANDARD)

    {
        pay = STANDARD * RATE + (RATE * 1.5);
    }
    else
    {
        pay = hours * RATE;
    }
    printf("应付工资：%f\n", pay);

    return 0;
}
