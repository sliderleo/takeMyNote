package com.example.notemynotes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NoteInfo {
   private String title,notes, userId, color;
   private Date date;
   public NoteInfo(String title, String notes, String color, Date date, String userId){
      this.title=title;
      this.notes=notes;
      this.color=color;
      this.date=date;
   }

   public String getTitle(){
      return this.title;
   }
   public String getNotes(){
      return this.notes;
   }
   public String getColor(){
      return this.color;
   }
   public Date getDate(){ return this.date; }
   public String getUserId(){ return this.userId; }

   public void setTitle(String title) {
      this.title = title;
   }
   public void setNotes(String notes) {
      this.notes = notes;
   }
   public void setColor(String color) {
      this.color = color;
   }
   public void setUserId(String userId) {
      this.userId = userId;
   }
   public void setDate(Date date) {
      this.date = date;
   }
}
