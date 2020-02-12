package main.java.ie.murph.constants;

public enum Resources
{
	_AN_INTRODUCTION_TO_THE_JAVA_COLLECTIONS_FRAMEWORK("https://dzone.com/articles/an-introduction-to-the-java-collections-framework?utm_source=dzone&utm_medium=article&utm_campaign=java-collections-cluster"),
	_THE_BEST_OF_JAVA_COLLECTIONS_TUTORIALS("https://dzone.com/articles/the-best-of-java-collections-tutorials?utm_source=dzone&utm_medium=article&utm_campaign=java-streams-cluster"),
	_A_DEVELOPERS_GUIDE_TO_COLLECTIONS("https://dzone.com/articles/a-deep-dive-into-collections?utm_source=dzone&utm_medium=article&utm_campaign=java-collections-cluster");
	
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
