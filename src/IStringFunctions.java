public interface IStringFunctions {

    void showCharAt(int tempIndex);
    void showEquals(String otherText);
    void showEqualsIgnoreCase(String otherText);
    void showCompareTo(String otherText);
    void showCompareToIgnoreCase(String otherText);
    void showStartWith(String otherTxt);
    void showStartWith(String otherTxt,int offset);
    void showEndWith(String otherTxt);
    void showHashCode();
    void showIndexOf(char tempChar);
    void showIndexOf(char tempChar,int fromIndex);
    void showLastIndexOf(char tempChar);
    void showLastIndexOf(char tempChar,int fromIndex);
    void showSubstring(int startIndex,int lastIndex);
    void showSubstring(int startIndex);
    void showConcat(String addTheText);
    void showReplace(char oldChar, char newChar);
    void showContains(CharSequence checkTheWord);
    void showUpperCase();
    void showLowerCase();
    void showIntern();
    void showJoin(String firstStr,String secStr);
    void showIsEmpty();
    void showReplaceFirst(String replaceTxt);
    void showReplaceAll(String newWord);
    void showSplit(String splitObj);
    void showFormat();
    void showTrim();
    void showTheOriginal();
    void printText(String descriptionText,String finalValue);


}
