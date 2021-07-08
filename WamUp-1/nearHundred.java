public boolean nearHundred(int n) {
  if(n<=210){
    if (n>=190 || (n>=90 && n<=110)) return true;
  }
  return false;
}