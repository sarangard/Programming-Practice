import java.io.Serializable;

/**
 * Sample Singleton Implementation in Java
 * 
 * @author Sarang
 */
public class Singleton implements Serializable
{
	private static final long serialVersionUID = 1L;

	/*
	 * Default Constructor
	 */
	private Singleton()
	{
	}
	
	/*
	 * Creates a Unique Instance of this class.
	 */
	private static class SingletonHolder
	{
		public static final Singleton INSTANCE = new Singleton();
	}
	
	/*
	 * Returns an instance of this class.
	 */
	public static Singleton getInstance()
	{
		return SingletonHolder.INSTANCE;
	}
	
	/*
	 * 
	 */
	protected Object readResolve()
	{
		return getInstance();
	}
}	