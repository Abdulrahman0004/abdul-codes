#include<stdio.h>
#include<conio.h>
void main()
{
int dividend,divisor,quotient,remainder;
clrscr();
printf("Enter dividend:");
scanf("%d",&dividend);
printf("Enter divisor:");
scanf("%d",&divisor);
quotient=dividend/divisor;
remainder=dividend%divisor;
printf("Quotient=%d\n",quotient);
printf("Remainder=%d\n",remainder);
getch();
}
