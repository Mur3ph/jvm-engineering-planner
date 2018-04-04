package main.java.ie.murph.java9.resources;

public enum Resources
{

	JAVA9STREAMS("Mastering Java 9: https://www.");

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
