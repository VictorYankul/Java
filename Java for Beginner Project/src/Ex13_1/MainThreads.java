package Ex13_1;
/*—оздать и запустить 3 дополнительных потока в основном (main) потоке.
 * аждый из потоков:
 *1. ¬ыводит сообщение, какой поток запущен и на какое врем€ "засыпает".
 *2. "«асыпает" на рандомное количество милисекунд.
 *3. "ѕросыпаетс€" и сообщает, что проснулс€ именно он.
 */
public class MainThreads {

	public static void main(String[] args) {
		Thread t1 = new Thread(new AddClass("1"));
		Thread t2 = new Thread(new AddClass("2"));
		Thread t3 = new Thread(new AddClass("3"));
		t1.start();
		t2.start();
		t3.start();
	}
}
