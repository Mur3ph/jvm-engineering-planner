package main.java.ie.murph.java8.resources;

public enum Resources
{

	JAVA8STREAMS("Mastering Java 8 Streams: https://www.marcobehler.com/episodes/121-mastering-java-8-streams-part-1");

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
