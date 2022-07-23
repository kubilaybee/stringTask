public class StringFuncs implements IStringFunctions{

//    "ali".equals(name);
//
//    String a = new String();
//    // nullpointer expection
//    a.equals();

    String dataName;
    // null Pointer exception test
//    String a;
//    String b;

    public StringFuncs(String dat) {
        dataName = dat;
    }

    @Override
    public void showCharAt(int tempIndex) {
        if (dataName.length()<=tempIndex){
            printText("Error","IndexOutOfBoundsException");
        }else {
            char tempData = dataName.charAt(tempIndex);
            printText("charAt",Character.toString(tempData));
        }
    }

    @Override
    public void showEquals(String otherText) {
        printText("equals",String.valueOf(dataName.equals(otherText)));
    }

    @Override
    public void showEqualsIgnoreCase(String otherText) {
        printText("equalsIgnoreCase",String.valueOf(dataName.equalsIgnoreCase(otherText)));
    }

    @Override
    public void showCompareTo(String otherText) {
        printText("CompareTo",String.valueOf(dataName.compareTo(otherText)));
    }

    @Override
    public void showCompareToIgnoreCase(String otherText) {
        // compare the unicode value
        printText("CompareToIgnoreCase",String.valueOf(dataName.compareTo(otherText)));
    }

    @Override
    public void showStartWith(String otherTxt) {
        printText("StartWith",String.valueOf(dataName.startsWith(otherTxt)));
    }

    @Override
    public void showStartWith(String otherTxt, int offset) {
        printText("StartWith",String.valueOf(dataName.startsWith(otherTxt,offset)));
    }

    @Override
    public void showEndWith(String otherTxt) {
        printText("EndWith",String.valueOf(dataName.endsWith(otherTxt)));
    }

    @Override
    public void showHashCode() {
        printText("HashCode",String.valueOf(dataName.hashCode()));
    }

    @Override
    public void showIndexOf(char tempChar) {
        printText("IndexOf",String.valueOf(dataName.indexOf(tempChar)));
    }

    @Override
    public void showIndexOf(char tempChar, int fromIndex) {
        printText("IndexOf",String.valueOf(dataName.indexOf(tempChar,fromIndex)));
    }

    @Override
    public void showLastIndexOf(char tempChar) {
        printText("LastIndexOf",String.valueOf(dataName.lastIndexOf(tempChar)));
    }

    @Override
    public void showLastIndexOf(char tempChar, int fromIndex) {
        printText("LastIndexOf",String.valueOf(dataName.lastIndexOf(tempChar,fromIndex)));
    }

    @Override
    public void showSubstring(int startIndex, int lastIndex) {
        printText("Substring",dataName.substring(startIndex,lastIndex));
    }

    @Override
    public void showSubstring(int startIndex) {
        printText("Substring",dataName.substring(startIndex));
    }

    @Override
    public void showConcat(String addTheText) {
        String tempStr = dataName;
        tempStr = tempStr.concat(addTheText);
        printText("Concat",tempStr);
    }

    @Override
    public void showReplace(char oldChar, char newChar) {
        String oldStr = dataName;
        printText("Replace",oldStr.replace(oldChar,newChar));
    }

    @Override
    public void showContains(CharSequence checkTheWord) {
        printText("Include",String.valueOf(dataName.contains(checkTheWord)));
    }

    @Override
    public void showUpperCase() {
        String upperTemp = dataName.toUpperCase();
        printText("UpperCase",upperTemp);
    }

    @Override
    public void showLowerCase() {
        String lowerTemp = dataName.toLowerCase();
        printText("LowerCase",lowerTemp);
    }

    @Override
    public void showIntern() {
        String str1 = new String();
        str1 = dataName;
        String str2 = dataName.intern();
        if (str1==str2){
            printText("Intern","str1=str2");
        }
    }

    @Override
    public void showJoin(String firstStr, String secStr) {
        // turn to list
        String tempStr = String.join("-",firstStr,secStr,dataName);
        printText("Join",tempStr);
    }

    @Override
    public void showIsEmpty() {
        printText("IsEmpty",String.valueOf(dataName.isEmpty()));
    }

    @Override
    public void showReplaceFirst(String replaceTxt) {
        String tempStr = dataName;
        // " "(.*) -> to endValue
        printText("FirstReplace",tempStr.replaceFirst(" (.*)",replaceTxt));
    }

    @Override
    public void showReplaceAll(String newWord) {
        String tempStr = dataName;
        printText("ReplaceAll",tempStr.replaceAll("temp",newWord));
    }

    @Override
    public void showSplit(String splitObj) {
        String tempStr = new String();
        String tempArr[] = dataName.split(splitObj);
        for (String temp : tempArr) {
            tempStr= tempStr.concat(","+temp);
        }
        printText("Split",tempStr);
    }

    @Override
    public void showFormat() {
        String tempStr = dataName;
        String formattedTempStr = String.format("My formatted String is %s",tempStr);
        printText("Format",formattedTempStr);
    }

    @Override
    public void showTrim() {
        String tempStr = dataName;
        // delete the whitespace
        printText("Trim",tempStr.trim());
    }

    @Override
    public void showTheOriginal() {
        printText("ORIGINAL",dataName);
    }

    @Override
    public void printText(String descriptionText, String finalValue) {
        System.out.println(descriptionText + ": "+finalValue);
    }
}
