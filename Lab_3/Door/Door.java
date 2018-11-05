// Ahmad Turan Naimey
// CS 136L-003
// Lab 3 - Door Class
public class Door
{
String m_name;  // Declaring Variables with the right data type
String m_state;

public Door()
{
  m_name = "door";
  m_state = "closed";
}

public Door(String name, String state) // The constructor for the class
{
  m_name = name; // sets m_name to string name
  m_state = state;
}

public void close() // The close door method (setter)
{
  m_state = "closed";
}

public void open() // The open door method (setter)
{
  m_state = "open";
}
public String getName() // Get name method (getter)
{
 return m_name;
}

public String getState() // Get state method (getter)
{
 return m_state;
}

public void setName(String newName) // setter
{
 m_name = newName;
}
public void setState(String newState) // State setter
{
 m_state = newState;
}

}
