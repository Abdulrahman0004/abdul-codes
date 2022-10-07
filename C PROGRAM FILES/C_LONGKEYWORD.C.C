#include<stdio.h>
#include<conio.h>
void main()
{
int a;
long b;
long long c;
double d;
long double e;
clrscr();
printf("Size of int=%d bytes\n",sizeof(a));
printf("Size of long int= %d bytes\n",sizeof(b));
printf("Size of long long int= %d bytes\n",sizeof(c));
printf("Size of double= %d bytes\n",sizeof(d));
printf("Size of long double= %d bytes\n",sizeof(e));
getch();
}