#include<stdio.h>
int main()
{
	int a=1;
	double b=2.0,c=1,d; 
	while(b<101){
		a=-a;
		d=a/b;
		c=c+d;
		b++;
	}
	printf("%f\n",c);
	return 0;
}
