/*
 * Sting s = "Mississippi";
 * 1. s.length() = 11
 * 2. s.substring(1) = ississippi
 * 3. s.substring(5,7) = ss
 * 
 * the position starts at zero, but when you count characters, start at 1
 * when you do a substring, start at x, but end at y-1. it's "ss" because the position starts at 0.
 * 
 * 
 * if(phrase.substring(x,x+1).equals("   "))
 *    String temp = phrase.substring(x,x+1);
 *        if(temp.equals("  "))
 * 
 * 
 * 
 * "hello".equals(a)
 */