package lab4;
import java.util.List;

public class CommentaryObject implements Subject,Commentary,Commercial{

	private final List<Observer>observers;
	private String desc,title;
	private final String subjectDetails;
	
	public CommentaryObject(List<Observer>observers,String subjectDetails){
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}
	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
		
	}

	@Override
	public void notifyObservers(String Line) {
		System.out.println();
		for(Observer observer : observers){
			observer.update(Line);
			
		}
		
	}
	
	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers(desc);
	}
	
	@Override
	public void setCommercial(String title) {
		this.title = title;
		notifyObservers(title);
	}
	
	@Override
	public String subjectDetails() {
		return subjectDetails;
	}
	
	

}
