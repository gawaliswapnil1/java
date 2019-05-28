package com.Dassault.java;

public class ThreadEvenOddPrint {

	public static void main(String[] args) {

		Printer p=new Printer();
		evenThread evn=new evenThread(p,10);
		oddThread odd=new oddThread(p,10);
		evn.start();
		odd.start();

	}

}

class evenThread extends Thread
{
	Printer p;int index;
	public evenThread(Printer p,int index) {
		this.p=p;
		this.index=index;
	}
	@Override
	public void run() {
		for(int i=2;i<=index;i=i+2)
		{
			try {
				p.printEvenThread(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class oddThread extends Thread
{
	Printer p;int index;
	public oddThread(Printer p,int index) {
		this.p=p;
		this.index=index;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=index;i=i+2)
		{
			try {
				p.printOddThread(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Printer
{
	private boolean isEvenPrinted = true;

	public   void printEvenThread(int index) throws InterruptedException {

		synchronized(this)
		{
			if(isEvenPrinted)
				this.wait();
			System.out.println(index);
			isEvenPrinted = true;
			this.notify();
		}
	}

	public   void printOddThread(int index) throws InterruptedException {

		synchronized(this)
		{
			if(!isEvenPrinted)
				this.wait();
			System.out.println(index);
			isEvenPrinted = false;
			notify();
		}
	}

}

