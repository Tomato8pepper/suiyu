#include<iostream>
using namespace std;
class Magic
{
public:
	void getdata();
	void setfirstmagic();
	void generatemagic();
	void printmagic();
private:
	int m[4][4];
	int step;
	int first;
	int sum;
};
void Magic::getdata(){                              //类外写需带上修饰符；默认int；
	cout<<"请依次输入初始值，差值:"<<endl;
	cin>>first;
	cin>>step;
	sum=first+15*step+first;
}
void Magic::setfirstmagic()
{
	int t=0;
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			m[i][j]=first+step*t;
			t++;
		}
	}
}
void Magic::generatemagic()
{
	int i,j,temp;
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
			temp=i+j;
			if(i==j)
				m[i][j]=sum-m[i][j];
			else if(temp==3)
				m[i][j]=sum-m[i][j];
			
		}
	}
}                 
void Magic::printmagic()
{
	int t=1;
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cout<<m[i][j];
			if(m[i][j]<10)
				cout<<"   ";
			else
				cout<<"  ";
			t++;
			if(t==5+4*i)
			{
				cout<<endl;
			}
		}
	}
}
int main()
{
	Magic ma;
	ma.getdata();
  	ma.setfirstmagic();
	ma.generatemagic();
	ma.printmagic();
	return 0;
}

