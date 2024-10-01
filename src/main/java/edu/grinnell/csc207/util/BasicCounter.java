package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
  /*fields
   * 
   * 
   */

   int count;
   int start;



   /* constructer
    * 

    */

    public BasicCounter (int startValue) {
      count = startValue;
      start = startValue;
    }
    public void increment () {
      this.count++;
    }
    public void reset () {
      this.count = this.start;
    }
    public String toString () {
      return "[" + this.count + "]";
    }
    public int get () {
      return this.count;
    }

}
