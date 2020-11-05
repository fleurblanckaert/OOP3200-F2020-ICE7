package ca.durhamcollege;

public class Person
{
    //PRIVATE INSTANCE VARIABLES
    private String m_name;
    private int m_age;

    //SETTERS AND GETTERS
    public String getName() {
        return m_name;
    }

    public void setName(String m_name) {
        this.m_name = m_name;
    }

    public int getAge() {
        return m_age;
    }

    public void setAge(int m_age) {
        this.m_age = m_age;
    }
    //CONSTRUCTORS
    public Person() {
        m_name = "unknown";
        m_age = 0;
    }
    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public Person(String name) {
        this.m_name = name;
        this.m_age = 0;
    }

    public Person(int age) {
        this.m_name = "unknown";
        this.m_age = age;
    }

    //METHODS

    /**
     *This method tests teh person class and returns a simple message to the consoel
     * @return {void}
     */
    public void saysHello()
    {
        System.out.println(this.m_name + " says hello!");
    }


    /**
     * This method overrides the built-in  toString method  and returns teh Persons properties
     * @return {String}
     */
    @Override
    public String toString() {
        String outputString = "";
        outputString += "Name: " + this.m_name + " ";
        outputString += "Age: " + this.m_age + " ";

        return outputString;
    }
}
