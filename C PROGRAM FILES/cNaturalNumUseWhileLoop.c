#include<stdio.h>
void main()
{
int n,i,sum=0;
printf("Enter a positive integer:");
scanf("%d",&n);
i=1;
while(i<=n)
{
 sum+=1;
 ++i;
}
printf("Sum=%d",sum);
}