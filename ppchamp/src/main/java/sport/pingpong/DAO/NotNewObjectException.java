package sport.pingpong.DAO;

public class NotNewObjectException extends Exception {

	Object obj;
	Class type;
	public NotNewObjectException(){}
	
	public NotNewObjectException(Object obj){
		this.obj = obj;
		this.type = obj.getClass();
	}
	
	@Override
	public void printStackTrace(){
		System.out.println("Object does exist in the memory " + obj.toString()
		+ " PersistentContext has object type :"+this.type );
	}

}
