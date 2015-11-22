package com.course.buildings;
public class Building
{
   protected int sqFeet;
   protected int stories;
   public void setSqFeet(int ft)
   {
      sqFeet = ft;
   }
   public void setStories(int floors)
   {
      stories = floors;
   }
   public int getSqFeet()
   {
      return sqFeet;
   }
   public int getStories()
   {
      return stories;
   }
}
