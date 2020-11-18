package com.company;

public class Course
{
    public Course (String name, String topic, String nameOfTeacher, int numberOfParticipants)
    {
        this.name = name;
        this.topic = topic;
        this.nameOfTeacher = nameOfTeacher;
        this.numberOfParticipants = numberOfParticipants;
    }
    public String toString()
    {
        return nameOfTeacher + ": "+ name + " (" + topic + "), " + "number of students: " + numberOfParticipants;
    }
    public void setName( String name)
    {
        this.name = name;
    }
    public String getName ()
    {
        return name;
    }
    public void setTopic (String topic)
    {
       this.topic = topic;
    }
    public String getTopic ()
    {
        return topic;
    }
    public void setNameOfTeacher(String nameOfTeacher)
    {
        this.nameOfTeacher = nameOfTeacher;
    }
    public String getNameOfTeacher()
    {
        return nameOfTeacher;
    }
    public String getNumberOfParticipants ()
    {
        String negStud = "The number of participants in this class is negative";
        String numStud = String.valueOf(numberOfParticipants);
        if ( numberOfParticipants >= 0)
            return numStud;
        else
            return negStud;
    }
    public void SetNumberOfParticipants( int numberOfParticipants)
    {
        this.numberOfParticipants = numberOfParticipants;
    }
    public boolean hasParticipants()
    {
        if ( numberOfParticipants > 0)
            return true;
        else
            return false;
    }

    private String name;
    private String topic;
    private String nameOfTeacher;
    private int numberOfParticipants;
}
