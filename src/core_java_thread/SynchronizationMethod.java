package core_java_thread;
class BookedSeat{
	int toatl_seat=10;
	synchronized public void bookedseat(int a) {
		if(a<=toatl_seat) {
			toatl_seat=toatl_seat-a;
			System.out.println("Seat is Available's"+ toatl_seat); 
		}else {
			System.out.println("Seat is Available's"+ toatl_seat); 
		}
	}
}


public class SynchronizationMethod extends Thread{
	static BookedSeat b;
	int seat;
	public void run() {
		b.bookedseat(seat);
		}
	public static void main(String[] args) {
		b=new BookedSeat();
	
		SynchronizationMethod  sm=new SynchronizationMethod();
		sm.seat=7;
		sm.start();
		
		SynchronizationMethod  sm2=new SynchronizationMethod();
		sm2.seat=9;
		sm2.start();
		
		

	}

}
