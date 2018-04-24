#include <cstdio>
#include <cstdlib>

class Stack
{
public:
	int* stack;
	int top;
	int capacity;
public:
	//���� ������
	Stack(const Stack& arg)
	{
		stack = new int[capacity=arg.capacity];
		top = arg.top;
		for (int i = 0; i < top; ++i)
			stack[i] = arg.stack[i];
	}
	//���� ���� ������
	const Stack& operator=(const Stack& arg)
	{
		return *this;
	}


	void Push(int data)
	{
		stack[top++] = data;
	}
	int Pop()
	{
		return stack[--top];
	}

	Stack(int cap)
	{
		capacity = cap;
		stack = new int[capacity];
		top = 0;
	}

	~Stack()
	{
		delete[] stack;
	}

};

void main()
{
	Stack st(1000);
	

	st.Push(100);
	st.Push(200);
	st.Push(300);

	Stack st2 = st;

	printf("%d\n", st.Pop());
	printf("%d\n", st.Pop());
	printf("%d\n", st.Pop());

	printf("%d\n", st2.Pop());
	printf("%d\n", st2.Pop());
	printf("%d\n", st2.Pop());


	system("pause");
}

//#include <cstdio>
//#include <cstdlib>
//
//class Stack
//{
//public:
//	int* stack;
//	int top;
//public:
//	void Push(int data)
//	{
//		stack[top++] = data;
//	}
//	int Pop()
//	{
//		return stack[--top];
//	}
//
//	Stack(int cap)
//	{
//		stack = new int[cap];
//		top = 0;
//	}
//
//	~Stack()
//	{
//		delete[] stack;
//	}
//
//};
//
//void main()
//{
//	Stack st(1000);
//	st.Push(100);
//	st.Push(200);
//	st.Push(300);
//
//	printf("%d\n", st.Pop());
//	printf("%d\n", st.Pop());
//	printf("%d\n", st.Pop());
//
//
//	system("pause");
//}

//#include <cstdio>
//#include <cstdlib>
//
//class Stack
//{
//public:
//	int* stack;
//	int top;
//public:
//void Push(int data)
//{
//	stack[top++] = data;
//}
//int Pop()
//{
//	return stack[--top];
//}
//
//void InitStack(int cap)
//{
//	stack = new int[cap];
//	top = 0;
//}
//
//void UninitStack()
//{
//	delete[] stack;
//}
//
//};
//
//void main()
//{
//	Stack st;
//
//	st.InitStack(1000);
//	st.Push(100);
//	st.Push(200);
//	st.Push(300);
//
//	printf("%d\n", st.Pop());
//	printf("%d\n", st.Pop());
//	printf("%d\n", st.Pop());
//	st.UninitStack();
//
//	system("pause");
//}

//#include <cstdio>
//#include <cstdlib>
//
//struct Stack
//{
//	int* stack;
//	int top;
//};
//
//void Push(Stack& st, int data)
//{
//	st.stack[st.top++] = data;
//}
//int Pop(Stack& st)
//{
//	return st.stack[--st.top];
//}
//
//void InitStack(Stack& st, int cap)
//{
//	st.stack = new int[cap];
//	st.top = 0;
//}
//
//void UninitStack(Stack& st)
//{
//	delete[] st.stack;
//}
//
//void main()
//{
//	Stack st;
//
//	InitStack(st, 1000);
//
//
//	Push(st, 100);
//	Push(st, 200);
//	Push(st, 300);
//
//
//	printf("%d\n", Pop(st));
//	printf("%d\n", Pop(st));
//	printf("%d\n", Pop(st));
//	UninitStack(st);
//
//	system("pause");
//}

//#include <cstdio>
//#include <cstdlib>
//
//struct Stack
//{
//	int stack[5];
//	int top;
//};
//
//void Push(Stack& st, int data)
//{
//	st.stack[st.top++] = data;
//}
//int Pop(Stack& st)
//{
//	return st.stack[--st.top];
//}
//
//void InitStack(Stack& st)
//{
//	st.top = 0;
//}
//
//void UninitStack(Stack& st)
//{
//}
//
//void main()
//{
//	Stack st;
//
//	InitStack(st);
//
//
//	Push(st, 100);
//	Push(st, 200);
//	Push(st, 300);
//
//
//	printf("%d\n", Pop(st));
//	printf("%d\n", Pop(st));
//	printf("%d\n", Pop(st));
//	UninitStack(st);
//
//	system("pause");
//}

//#include <cstdio>
//#include <cstdlib>
//
//struct Stack
//{
//	int stack[5];
//	int top;
//};
//
//void Push(Stack& st, int data)
//{
//	st.stack[st.top++] = data;
//}
//int Pop(Stack& st)
//{
//	return st.stack[--st.top];
//}
//
//void main()
//{
//	Stack st = { 0 };
//	Stack st2 = { 0 };
//
//
//	Push(st, 100);
//	Push(st, 200);
//	Push(st, 300);
//	Push(st2, 10);
//	Push(st2, 20);
//
//	printf("%d\n", Pop(st));
//	printf("%d\n", Pop(st));
//	printf("%d\n", Pop(st));
//	printf("%d\n", Pop(st2));
//	printf("%d\n", Pop(st2));
//
//	system("pause");
//}

//#include <cstdio>
//#include <cstdlib>
//
//void Push(int stack[], int& top, int data)
//{
//	stack[top++] = data;
//}
//int Pop(int stack[], int& top)
//{
//	return stack[--top];
//}
//
//void main()
//{
//	int stack[5];
//	int top = 0;
//	int stack2[5];
//	int top2 = 0;
//
//	Push(stack, top, 100);
//	Push(stack, top, 200);
//	Push(stack, top, 300);
//	Push(stack2, top2, 10);
//	Push(stack2, top2, 20);
//
//	printf("%d\n", Pop(stack, top));
//	printf("%d\n", Pop(stack, top));
//	printf("%d\n", Pop(stack, top));
//	printf("%d\n", Pop(stack2, top2));
//	printf("%d\n", Pop(stack2, top2));
//	system("pause");
//}


//#include <cstdio>
//#include <cstdlib>
//
//int stack[5];
//int top = 0;
//void Push(int data)
//{
//	stack[top++] = data;
//}
//int Pop()
//{
//	return stack[--top];
//}
//
//void main()
//{
//	Push(100);
//	Push(200);
//	Push(300);
//
//	printf("%d\n", Pop());
//	printf("%d\n", Pop());
//	printf("%d\n", Pop());
//	system("pause");
//}


//#include <cstdio>
//#include <cstdlib>
//void main()
//{
//	printf("Hello\n");
//	system("pause");
//}