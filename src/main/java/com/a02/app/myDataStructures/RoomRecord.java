package com.a02.app.myDataStructures;

import java.util.List;

// Rooms of a game board
public record RoomRecord(String name, String description,
List<String> exits)
{
  public String getExits(){
    StringBuilder exitDesc = new StringBuilder();
    if(exits.isEmpty()){
      exitDesc.append("No obvious exits.");
    } else if(exits.size() == 1){
      exitDesc.append("An exit to the ");
      exitDesc.append(exits.get(0));
    } else if(exits.size() == 2){
      exitDesc.append("Exits to the ");
      exitDesc.append(exits.get(0));
      exitDesc.append(" and ");
      exitDesc.append(exits.get(1));
    } else {
      exitDesc.append("Exits to the ");
      boolean first = true;
      for(String exit : exits){
        if(first == false){
          exitDesc.append(", ");
        } else {
          first = false;
        }
        exitDesc.append(exit);
      }
    }
    exitDesc.append(".");
    return exitDesc.toString();
  }
} 