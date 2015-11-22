// Student.java
// Chapter 3, Exercise 12
// Part c
// Adds constructor to Student class
class Student
{
  // the private data members
     private int idNumber;
     private int hours;
     private int points;

  // Constructor added in part c
  Student()
  {
     idNumber = 9999;
     points = 12;
     hours = 3;
  }
  // end of constructor added in part c

  // the public get and set methods

     public void setIDnumber(int number)
     {
	idNumber = number;
     }

     public int getIDnumber()
     {
	return idNumber;
     }

     public void setHours(int number)
     {
	hours = number;
     }

     public int getHours()
     {
	return hours;
     }

     public void setPoints(int number)
     {
	points = number;
     }

     public int getPoints()
     {
	return points;
     }

     // methods to display the fields

     public void showIDnumber()
     {
	System.out.println("ID Number is: " + idNumber);
     }

     public void showHours()
     {
	System.out.println("Credit Hours: " + hours);
     }

     public void showPoints()
     {
	System.out.println("Points Earned: " + points);
     }

     public double getGradePoint()
     {
	return (points * 1.0 / hours);
        // simple integer division will truncate the decimal places
     }
}
