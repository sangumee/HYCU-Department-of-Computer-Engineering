#include <cstdio>
int Sum(int s, int e)
{
	int i;
	int sum = 0;
	for (i = s; i <= e; i++)
		sum = sum + i;
	return sum;
}

void main()
{
	int sum = 0;

	sum = Sum(1, 10);
	printf("sum = %d\n", sum);
	printf("sum = %d\n", Sum(5,10));
	printf("sum = %d\n", Sum(10,20));

	getchar();
}



//#include <cstdio>
//int Sum()
//{
//	int i;
//	int sum = 0;
//	for (i = 1; i <= 10; i++)
//		sum = sum + i;
//	return sum;
//}
//
//void main()
//{
//	int sum = 0;
//	
//	sum = Sum();
//	printf("sum = %d\n", sum);
//	printf("sum = %d\n", Sum());
//
//	getchar();
//}

//#include <cstdio>
//void main()
//{
//	int n = 10;
//
//	printf("%d\n", n);
//	getchar();
//}

