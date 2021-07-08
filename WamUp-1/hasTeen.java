public boolean hasTeen(int a, int b, int c) {
  boolean one = a <= 19 && a >= 13;
  boolean two = b <= 19 && b >= 13;
  boolean three = c <= 19 && c >= 13;
  return ( one || two || three);
}