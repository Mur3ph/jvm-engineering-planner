package main.java.ie.murph.java7.resources;

public enum Resources
{

	JAVA7STREAMS("Mastering Java 7: https://www.");

	private final String text;

	private Resources(final String text)
	{
		this.text = text;
	}

	@Override
	public String toString()
	{
		return this.text;
	}
}
