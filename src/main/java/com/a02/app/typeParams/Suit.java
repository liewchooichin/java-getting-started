package com.a02.app.typeParams;

public enum Suit {
  // ; at the end of list required for enums with parameters
  HEART('♥'),
  CLUB('♣'),
  DIAMOND('♦'),
  SPADE('♠'); // semicolon is required.

  // fields
  private char symbol;
  private char letter;

  // getters
  public char getSymbol() {
    return symbol;
  }

  public char getLetter() {
    return letter;
  }

  // private constructor to declare the enum value itself.
  private Suit(char symbol){
    this.symbol = symbol;
    this.letter = switch(symbol){
      case '♥' -> 'H';
      case '♣' -> 'C';
      case '♦' -> 'D';
      case '♠' -> 'S';
      default -> throw new RuntimeException("Illegal: " + symbol);
    };
  }
}
