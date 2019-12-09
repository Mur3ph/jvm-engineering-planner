package main.java.ie.murph.constants;

public enum Resources
{
	CONNECTION_LOST("Connection to server lost: "),
	_THE_BEST_OF_JAVA_COLLECTIONS_TUTORIALS("https://dzone.com/articles/the-best-of-java-collections-tutorials?utm_source=dzone&utm_medium=article&utm_campaign=java-streams-cluster");
	
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
