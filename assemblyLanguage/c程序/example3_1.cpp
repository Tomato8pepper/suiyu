#include<iostream>
#include<string>
using namespace std;
class Student
{
public:
	Student(int n,string na,double d)
	{
		no=n;
		deg=d;
		name=na;
		sum+=d;
		num++;
	}
	static double avg()
	{
		return sum/num;
	}
	static int total()
	{
		return sum;
	}
	void disp()
	{
		cout<<no<<"         "<<name<<"         "<<deg<<endl;
	}
private:
	int no;
	string name;
	double deg;
	static double sum;
	static int num;
};
double Student::avg=0;
int Student::num=0;
int main()
{
	Student s1(101,"������",97),s2(102,"����",98),s3(103,"����",99);
	cout<<"ѧ��         ����         �ɼ�\n";
	s1.disp();
	s2.disp();
	s3.disp();
    cout<<"ѧ������="<<Student::total()<<endl;
	cout<<"ƽ���ɼ�="<<Student::avg();
	return 0;
}