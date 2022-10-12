#include<stdio.h>
#include<conio.h>
void main()
{
int number;
clrscr();
printf("Enter an integer:");
scanf("%d",&number);
if (number%2==0)
{
printf("%d is an even number",number);
}
else
{
printf("%d is an odd number");
}
getch();
}