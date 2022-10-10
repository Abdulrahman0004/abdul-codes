#include<stdio.h>
#include<conio.h>
void main()
{
int number;
clrscr();
printf("Enter an integer:");
scanf("%d",&number);
if (number<0)
{
printf("You entered %d\n",number);
}
printf("The if statement is easy");
getch();
}
