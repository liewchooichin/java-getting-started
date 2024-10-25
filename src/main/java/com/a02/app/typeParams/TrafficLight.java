package com.a02.app.typeParams;

public enum TrafficLight {
  RED((short) -1),
  GREEN((short)1),
  YELLOW((short)0);

  private short value;
  private char letter;

  public short getValue(){
    return value;
  }
  public char getLetter(){
    return letter;
  }
  private TrafficLight(short value){
    this.value = value;
    this.letter = switch(value){
      case -1 -> 'R';
      case 0 -> 'Y';
      case 1 -> 'G';
      default -> throw new RuntimeException("Illegal: " + value);
      };
    };
  }
