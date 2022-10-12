#include<stdio.h>
#include<conio.h>
void main()
{
int number1,number2;
clrscr();
printf("Enter two integers:");
scanf("%d%d",&number1,number2);
if (number1>=number2)
{
if (number1==number2)
{
printf("Result:%d=%d",number1,number2);
}
else
{
printf("Result:%d>%d",number1,number2);
}
}
else
{
printf("Result:%d<%d",number1,number2);
}
getch();
}