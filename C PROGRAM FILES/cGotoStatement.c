#include<stdio.h>
void main()
{
const int maxInput=100;
int i;
double number,average,sum=0.0;
for(i=1;i<=maxInput;++i)
{
printf("%d Enter a number:",i);
scanf("%lf",&number);
if(number<0.0)
{
goto jump;
}
sum+=number;
}
jump:
average=sum/(i-1);
printf("Sum=%2lf\n",sum);
printf("Average=%2lf",average);
}