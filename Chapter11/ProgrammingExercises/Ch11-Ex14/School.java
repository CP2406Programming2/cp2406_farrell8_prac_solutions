package com.course.buildings;
public class School extends Building
{
   protected int classrooms;
   protected String gradeLevel;
   public void setClassrooms(int rooms)
   {
      classrooms = rooms;
   }
   public void setGradeLevel(String level)
   {
      gradeLevel = level;
   }
   public int getClassrooms()
   {
      return classrooms;
   }
   public String getGradeLevel()
   { 
      return gradeLevel;
   }
}
