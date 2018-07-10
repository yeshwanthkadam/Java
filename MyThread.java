class MyThread extends Thread
{
	public static void main(String[] args) {
		MyThread t = new MyThread();
			System.out.println(t.getName()+"\n"+t.getId()+"\n"+t.getPriority()+"\n"+t.getPriority());
			System.out.println(t.join());

	}
}
