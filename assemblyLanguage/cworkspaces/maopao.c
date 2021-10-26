#include<stdio.h>
int main()
{
	int i,j,t;
	int a[10];
	printf("请输入十个数:\n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	for(j=0;j<9;j++)
		for(i=0;i<9-j;i++)
			if(a[i]>a[i+1])
			{
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
	printf("the sored number:\n");
	for(i=0;i<10;i++)
		printf("%4d",a[i]);
	printf("\n");
	return 0;
}
