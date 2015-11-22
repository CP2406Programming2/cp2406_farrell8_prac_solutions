public class Recording
{
   private String song;
   private String artist;
   private int playTime;
   public void setSong(String title)
   {
      song = title;
   }
   public void setArtist(String name)
   {
      artist = name;
   }
   public void setPlayTime(int time)
   {
      playTime = time;
   }
   public String getSong()
   {
      return song;
   }
   public String getArtist()
   {
      return artist;
   }
   public int getPlayTime()
   {
      return playTime;
   }
}