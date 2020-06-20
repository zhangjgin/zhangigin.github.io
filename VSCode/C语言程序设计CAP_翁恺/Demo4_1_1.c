#include <stdio.h>
int main(int argc, char const *argv[])
{
    //方式一：
    // int x;
    // int n = 1;
    //printf("请输入：");
    // scanf("%d",&x);
    // if (x > 999)
    // {
    //     n = 4;
    // }else if (x > 99)
    // {
    //     n = 3;
    // }else if (x > 9)
    // {
    //     n = 2;
    // }
    // printf("%d\n",n);


    //方式二：
    // int x;
    // int n = 0;
    // printf("请输入：");
    // scanf("%d", &x);
    // n++;
    // x /= 10;
    // while (x > 0)
    // {
    //     n++;
    //     x /= 10;
    // }
    // printf("%d\n", n);

    //方式三：
    // int x;
    // int n = 0;
    // printf("请输入：");
    // scanf("%d", &x);
    // while (x > 0)
    // {
    //     n++;
    //     x /= 10;
    // }
    // printf("%d\n", n);

    //方式四：
    int x;
    int n = 0;
    printf("请输入数字：");
    scanf("%d",&x);
    if (x > 0)
    {
        while (x > 0)
        {
            n++;
            x /= 10;
        }
    }
    else
    {
        n = 1;
    }
    printf("%d\n", n);

    return 0;
}
