package Week6;
public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
