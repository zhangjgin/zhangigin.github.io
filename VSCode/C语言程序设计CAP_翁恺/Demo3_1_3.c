#include<stdio.h>
int main(int argc, char const *argv[])
{
    const int MINOR = 35;
    int age = 0;
    printf("请输入你的年龄：");
    scanf("%d",&age);
    if(age < MINOR){
        printf("年龄是美好的，");
    }
    printf("年龄决定了你的精神世界，好好珍惜吧。\n");
    return 0;
}
