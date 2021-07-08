public String backAround(String str) {
  String word=str.substring(str.length()-1);
  return word+str+word;
}