#include<stdio.h>
int main()
{
int num;
printf("Enter an integer:");
scanf("%d",&num);
(num%2==0)?printf("% is even",num):printf("%d is odd",num);
}
