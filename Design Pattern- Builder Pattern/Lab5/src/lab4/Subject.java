package lab4;
public interface Subject {
	
	public void subscribeObserver(Observer observer);
	public void unSubscribeObserver(Observer observer);
	public void notifyObservers(String Line);
	public String subjectDetails();
}
