public String delDel(String str) {
  if(str.length()>3){
    if(str.substring(1,4).equals("del")){
      return str.substring(0, 1).concat(str.substring(4, str.length()));
    }
  }
  return str;
}