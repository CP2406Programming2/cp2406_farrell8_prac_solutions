package com.course.buildings;
public class House extends Building
{
   protected int bedrooms;
   protected int baths;
   public void setBedrooms(int rooms)
   {
      bedrooms = rooms;
   }
   public void setBaths(int rooms)
   {
      baths = rooms;
   }
   public int getBedrooms()
   {
      return bedrooms;
   }
   public int getBaths()
   {
      return baths;
   }
}
